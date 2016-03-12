package cn.cust.wpc.javaee.zookeeper;

import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * @author: pengcheng.wang
 * @since: 16/2/24 下午9:18
 * <p/>
 * zookeeper客户端
 */
public class ZookeeperClient {
    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181", 3000, new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("已经触发了" + event.getType() + "事件!");
            }
        });
        //  创建一个目录节点
        zooKeeper.create("/testRootPath", "testRootData".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);


        //  创建一个子目录节点
        zooKeeper.create("/testRootPath/testChildPathOne", "testChildDataOne".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(new String(zooKeeper.getData("/testRootPath", false, null)));

        //  取出子目录节点列表
        System.out.println(zooKeeper.getChildren("/testRootPath", true));

        //  创建另一个子目录节点
        zooKeeper.create("/testRootPath/testChildPathTwo", "testChildPathTwo".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(zooKeeper.getChildren("/testRootPath", true));

        //  修改子目录节点
        zooKeeper.setData("/testRootPath/testChildPathOne", "hahahahahaha".getBytes(), -1);
        byte[] datas = zooKeeper.getData("/testRootPath/testChildPathOne", true, null);
        String str = new String(datas, "utf-8");
        System.out.println(str);

        //删除整个子目录   -1代表version版本号，-1是删除所有版本
        zooKeeper.delete("/testRootPath/testChildPathOne", -1);
        zooKeeper.delete("/testRootPath/testChildPathTwo", -1);
        zooKeeper.delete("/testRootPath", -1);
    }
}