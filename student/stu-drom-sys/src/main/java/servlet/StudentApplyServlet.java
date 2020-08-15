package servlet;

import dao.StudentDao;
import model.Student;
import util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:xiang
 * @Date:2020/7/13 22:27
 */
@WebServlet("/student/apply")
public class StudentApplyServlet extends AbstractBaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Student s= JSONUtil.read(req.getInputStream(),Student.class);
        int num= StudentDao.apply(s);
        return null;
    }
}
