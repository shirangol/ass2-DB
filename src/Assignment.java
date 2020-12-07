//import Entities.UsersEntity;
//import org.hibernate.Session;
//
//import javax.persistence.Query;
//import java.util.List;
//
//import Entities.AdministratorsEntity;
//import Entities.MediaitemsEntity;
//import Entities.UsersEntity;
//import org.hibernate.*;
//import org.hibernate.cfg.Configuration;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.metamodel.EntityType;
//
//import java.sql.Timestamp;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Locale;




import Entities.AdministratorsEntity;
import Entities.MediaitemsEntity;
import Entities.UsersEntity;
import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.EntityType;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;



public class Assignment {
    public static boolean isExistUsername (String username){
        Session session= HibernateUtil.currentSession();
        String query= "from UsersEntity";
        try{
            UsersEntity u=new UsersEntity();
//            Transaction tr=session.beginTransaction();
//            u.setUsername("hen");
//            session.saveOrUpdate(u);
//            tr.commit();
            List<UsersEntity> users= session.createQuery(query).list();
            for (UsersEntity user:users) {
                if(user.getUsername().equals(username)){
                    return true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }

        return false;
    }






}
