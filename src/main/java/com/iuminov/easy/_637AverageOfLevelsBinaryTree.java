package com.iuminov.easy;

import java.util.ArrayList;
import java.util.List;

public class _637AverageOfLevelsBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        List<double[]> arrSum = new ArrayList<>();
        doRecCount(arrSum, root, 0);


        for (int i = 0; i < arrSum.size(); i++) {
            double[] d = arrSum.get(i);
            result.add(d[0] / d[1]);
        }

        return result;
    }

    private void doRecCount(List<double[]> sum, TreeNode node, int i) {
        if (node == null) {
            return;
        }
        if (sum.size() <= i) {
            sum.add(new double[]{0, 0});
        }
        double[] d = sum.get(i);
        d[0] += node.val;
        d[1]++;
        doRecCount(sum, node.left, i + 1);
        doRecCount(sum, node.right, i + 1);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
