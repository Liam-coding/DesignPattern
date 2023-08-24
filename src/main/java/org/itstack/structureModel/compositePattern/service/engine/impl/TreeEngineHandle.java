//package org.itstack.structureModel.compositePattern.service.engine.impl;
//
//import org.itstack.structureModel.compositePattern.service.engine.EngineBase;
//
//public class TreeEngineHandle extends EngineBase {
//    @Override
//    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
//        // decision process
//        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
//        //decision result
//        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
//    }
//}