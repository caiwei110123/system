//package readgit;
//
//import org.eclipse.jgit.api.Git;
//import org.eclipse.jgit.api.errors.JGitInternalException;
//import org.eclipse.jgit.lib.ObjectId;
//import org.eclipse.jgit.lib.ObjectLoader;
//import org.eclipse.jgit.lib.Ref;
//import org.eclipse.jgit.lib.Repository;
//import org.eclipse.jgit.revwalk.RevCommit;
//import org.eclipse.jgit.revwalk.RevTree;
//import org.eclipse.jgit.revwalk.RevWalk;
//import org.eclipse.jgit.treewalk.TreeWalk;
//
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.FutureTask;
//
///**
// * 功能描述：
// *
// * @author : yilie
// * @date : 2019/7/30  上午10:46
// * @Version 1.0
// */
//public class readgittest {
//
//    public  static String child = "http://gitlab.alibaba-inc.com/online-solution/xdelivery-ide.git";//远程库路径
//
//    public static void main(String[] args) {
//read();
//    }
//    /**
//     * 获取指定分支、指定文件的内容
//     * @param gitRoot git仓库目录
//     * @param branchName 分支名称
//     * @param fileName 文件名称
//     * @return
//     * @throws Exception
//     */
//    public static String getContentWithFile(String gitRoot, final String branchName, String fileName)
//        throws Exception {
//        final Git git = Git.open(new File(gitRoot));
//        Repository repository = git.getRepository();
//
//        repository = git.getRepository();
//        RevWalk walk = new RevWalk(repository);
//        Ref ref = repository.getRef(branchName);
//        if (ref == null) {
//            //获取远程分支
//            ref = repository.getRef(REF_REMOTES + branchName);
//        }
//        //异步pull
//        ExecutorService executor = Executors.newCachedThreadPool();
//        FutureTask<Boolean> task = new FutureTask<Boolean>(new Callable<Boolean>() {
//            @Override
//            public Boolean call() throws Exception {
//                /*//创建分支
//                CreateBranchCommand createBranchCmd = git.branchCreate();
//                createBranchCmd.setStartPoint(REF_REMOTES + branchName).setName(branchName).call();*/
//                return git.pull().call().isSuccessful();
//            }
//        });
//        executor.execute(task);
//
//        ObjectId objId = ref.getObjectId();
//        RevCommit revCommit = walk.parseCommit(objId);
//        RevTree revTree = revCommit.getTree();
//
//        TreeWalk treeWalk = TreeWalk.forPath(repository, fileName, revTree);
//        //文件名错误
//        if (treeWalk == null)
//            return null;
//
//        ObjectId blobId = treeWalk.getObjectId(0);
//        ObjectLoader loader = repository.open(blobId);
//        byte[] bytes = loader.getBytes();
//        if (bytes != null)
//            return new String(bytes);
//        return null;
//    }
//
//}
