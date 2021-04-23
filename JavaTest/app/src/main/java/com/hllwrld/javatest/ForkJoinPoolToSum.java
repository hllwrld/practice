package com.hllwrld.javatest;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class ForkJoinPoolToSum {



    private final static int THRESHOLD = MakeArray.ARRAY_LENGTH/10;

    static class SumTask extends RecursiveTask<Integer> {

        private int[] mNums;
        private int mFrom;
        private int mTo;


        public SumTask(int[] nums, int from, int to) {
            mNums = nums;
            mFrom = from;
            mTo = to;
        }


        @Override
        protected Integer compute() {
            int sum = 0;
            if (mTo - mFrom < THRESHOLD) {
                for (int i = mFrom; i < mTo; i++) {
                    sum += mNums[i];
                }
            } else {
                int mid = (mTo + mFrom) / 2;
                SumTask leftTask = new SumTask(mNums, mFrom, mid);
                SumTask rightTask = new SumTask(mNums, mid, mTo);
                invokeAll(leftTask, rightTask);
                sum = leftTask.join() + rightTask.join();
            }
            return sum;
        }
    }



    public static void main(String[] args) {
        System.out.println("start compute");
        int[] nums = MakeArray.makeArray();
        SumTask sumTask = new SumTask(nums, 0, nums.length);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.invoke(sumTask);
        int ret = sumTask.join();
        System.out.println("result :" + ret);
    }
}
