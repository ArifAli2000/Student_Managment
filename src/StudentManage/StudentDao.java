package StudentManage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
    public static boolean inserStudentToDB(Student st) {
        boolean f=false;
      try{
          //jdbc code
          Connection con= CP.create();
          String q="insert into students(sname,sphone,scity) values(?,?,?)";
          //PreparedStatement
          PreparedStatement pstmt=con.prepareStatement(q);
          //set the values of parameter
          pstmt.setString(1, st.getStudentName());
          pstmt.setInt(2,st.getStudentPhone());
          pstmt.setString(3,st.getStudentCity());

          //execute
          pstmt.executeUpdate();
          f=true;
      } catch (Exception e){
          e.printStackTrace();
      }
      return f;
    }
}
