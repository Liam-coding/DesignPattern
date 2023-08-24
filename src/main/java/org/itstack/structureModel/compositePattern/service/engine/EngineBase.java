//package org.itstack.structureModel.compositePattern.service.engine;
//
//import org.itstack.structureModel.compositePattern.service.logic.LogicFilter;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import javax.swing.tree.TreeNode;
//import java.util.Map;
//
//import static org.itstack.structureModel.compositePattern.service.engine.EngineConfig.logicFilterMap;
//
//public class EngineBase {
//    private Logger logger = LoggerFactory.getLogger(EngineBase.class);
//
//    @Override
//    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);
//
//    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
//        TreeRoot treeRoot = treeRich.getTreeRoot();
//        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();
//        Long rootNodeId = treeRoot.getTreeRootNodeId();
//        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
//        while (treeNodeInfo.getNodeType().equals(1)) {
//            String ruleKey = treeNodeInfo.getRuleKey();
//            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
//            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
//            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
//            treeNodeInfo = treeNodeMap.get(nextNode);
//            logger.info("decide engine =>{} userId {} treeId {} treeNode {} ruleKey {} matterValue {}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
//        }
//        return treeNodeInfo;
//    }
//}