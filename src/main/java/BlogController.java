package main.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *Blogを操作するビジネスロジック
 */
public class BlogController {
	/**
	 * シングルトンのインスタンス
	 */
	 private static BlogController controller = new BlogController();

	 /**
	  * このクラスのインスタンスを取得します
	  * @return BlogControllerのインスタンス
	  */
	 public static BlogController getInstance(){
		 return controller;
	 }

	 private BlogController(){

	 }

	 /**
	  * トピックをポスト（登録）します
	  * @param topic トピック
	  */
	 public void postTopic(Topic topic){
		 String sql = "INSERT INTO TOPIC (TITLE, CONTENT) VALUES (?, ?)";

		 Connection con = null;
		 PreparedStatement ps = null;

		 try{

			 con = ConnectionManager.getConnection();
			 ps = con.prepareStatement(sql);

			 ps.setString(1, topic.getTitle());
			 ps.setString(2, topic.getContent());

			 ps.executeUpdate();

		 }catch(SQLException e){
			 e.printStackTrace();
		 }finally{

			 if(ps != null){
				 try{
					 ps.close();
				 }catch(Exception ignore){
				 }
			 }
			 if(con != null){
				 try{
					 con.close();
				 }catch(Exception ignote){
				 }
			 }
		 }
	 }

	 /**
	  * トピックを取得します
	  * @return トピックのリスト
	  */
	 public List<Topic> getTopics(){
		 String sql = "SELECT* FROM TOPIC";
		 List<Topic> topics = new ArrayList<Topic>();

		 Connection con = null;
		 PreparedStatement ps = null;
		 ResultSet rs = null;

		 try{

			 con = ConnectionManager.getConnection();
			 ps = con.prepareStatement(sql);
			 rs = ps.executeQuery(sql);

			 while(rs.next()){
				 Topic topic = new Topic();
				 topic.setId(rs.getInt("ID"));
				 topic.setPostDate(rs.getTimestamp("POST_DATE"));
				 topic.setTitle(rs.getString("TITLE"));
				 topic.setContent(rs.getString("CONTENT"));
				 topics.add(topic);
			 }
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			if(rs != null){
				try{
					rs.close();
				}catch(Exception ignore){
				}
			}
			if(ps != null){
				try{
					ps.close();
				}catch(Exception ignore){
				}
			}
			if(con != null){
				try{
					con.close();
				}catch(Exception ignore){
				}
			}
		}
		return topics;
	 }
}
