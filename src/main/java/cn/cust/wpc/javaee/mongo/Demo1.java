package cn.cust.wpc.javaee.mongo;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: pengcheng.wang
 * @since: 16/2/27 下午4:48
 * MongoClient示例代码
 */
public class Demo1 {

    private static MongoClient mongoClient;

    static {
        ServerAddress serverAddress = new ServerAddress("127.0.0.1", 27017);
//        ServerAddress serverAddress = new ServerAddress("10.151.11.4", 29017);
        List<MongoCredential> mongoCredentialList = new ArrayList<MongoCredential>();
        mongoCredentialList.add(MongoCredential.createCredential("bank", "bank_chanel", "bank1q2w3e".toCharArray()));
        mongoClient = new MongoClient(serverAddress, mongoCredentialList);
    }

    /**
     * 获取指定数据库
     *
     * @param dbName
     * @return
     */
    public MongoDatabase getDatabase(String dbName) {
        return mongoClient.getDatabase(dbName);
    }

    /**
     * 创建表
     *
     * @param collectionName
     */
    public void createCollection(MongoDatabase mongoDatabase, String collectionName) {
        mongoDatabase.createCollection(collectionName);
    }

    /**
     * 删除表
     *
     * @param mongoDatabase
     * @param collectionName
     */
    public void deleteCollection(MongoDatabase mongoDatabase, String collectionName) {
        mongoDatabase.getCollection(collectionName).drop();
    }

    /**
     * 获取表
     *
     * @param mongoDatabase
     * @param collectionName
     * @return
     */
    public MongoCollection getCollection(MongoDatabase mongoDatabase, String collectionName) {
        //若表不存在，则获取表时会自动创建，插入数据之后表会显示
        return mongoDatabase.getCollection(collectionName);
    }


    /**
     * 增加记录
     *
     * @param mongoDatabase
     * @param collectionName
     * @param document
     */
    public void add(MongoDatabase mongoDatabase, String collectionName, Document document) {
        MongoCollection mongoCollection = getCollection(mongoDatabase, collectionName);
        mongoCollection.insertOne(document);
    }


    /**
     * 删除数据
     *
     * @param bson
     */
    public void delete(MongoDatabase mongoDatabase, String collectionName, Bson bson) {
        MongoCollection mongoCollection = getCollection(mongoDatabase, collectionName);
        mongoCollection.deleteOne(bson);
    }


    /**
     * 查询数据
     *
     * @param mongoDatabase
     * @param collectionName
     * @param bson
     * @return
     */
    public FindIterable query(MongoDatabase mongoDatabase, String collectionName, Bson bson) {
        MongoCollection mongoCollection = getCollection(mongoDatabase, collectionName);
        return mongoCollection.find(bson);
    }

    /**
     * 更新数据
     *
     * @param mongoDatabase
     * @param collectionName
     * @param oldBson
     * @param newBson
     */
    public void update(MongoDatabase mongoDatabase, String collectionName, Bson oldBson, Bson newBson) {
        MongoCollection mongoCollection = getCollection(mongoDatabase, collectionName);
        mongoCollection.updateOne(oldBson, newBson);
    }


    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        String dbName = "runoob";
        String collectionName = "col";
        MongoDatabase mongoDatabase = mongoClient.getDatabase(dbName);

//        添加数据
        Document document = new Document().append("title","mongoDB学习").append("by","pengchengwang");
        demo1.add(mongoDatabase,collectionName,document);

        //更新数据
//        Bson oldBson = Filters.eq("by", "pengchengwang");
//        Document newBson = new Document("$set",new Document("title","我在学习MongoDB"));
//        demo1.update(mongoDatabase,collectionName,oldBson,newBson);

        //根据条件查询数据
//        FindIterable findIterable = demo1.query(mongoDatabase, collectionName, Filters.eq("by", "pengchengwang"));
//        MongoCursor mongoCursor = findIterable.iterator();
//        while (mongoCursor.hasNext()){
//            Document document = (Document) mongoCursor.next();
//            System.out.println(document.toString());
//            System.out.println(document.get("title"));
//        }

        //删除数据
//        demo1.delete(mongoDatabase,collectionName, Filters.eq("by", "pengchengwang"));

        //删除集合
//        demo1.deleteCollection(mongoDatabase,collectionName);

    }
}