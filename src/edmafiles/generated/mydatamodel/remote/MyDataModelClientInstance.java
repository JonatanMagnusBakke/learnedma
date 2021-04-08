package edmafiles.generated.mydatamodel.remote;

import edmafiles.generated.mydatamodel.MyDataModel;
import edmafiles.generated.mydatamodel.actions.AssignStudentToCourseResult;
import edmafiles.generated.mydatamodel.actions.AssignTeacherToCourseResult;
import edmafiles.generated.mydatamodel.actions.CreateCourseResult;
import edmafiles.generated.mydatamodel.actions.CreatePersonResult;
import edmafiles.generated.mydatamodel.actions.CreateTeacherResult;
import edmafiles.generated.mydatamodel.views.GetAllCoursesResult;
import edmafiles.generated.mydatamodel.views.GetAllPersonsResult;
import edmafiles.generated.mydatamodel.views.GetCourseStudentsResult;
import edmafiles.generated.mydatamodel.views.GetCourseTeacherResult;
import edmafiles.generated.valuedomains.Email;
import edmafiles.generated.valuedomains.Name;
import edmafiles.generated.valuedomains.mydatamodel.CourseID;
import edmafiles.generated.valuedomains.mydatamodel.CourseList;
import edmafiles.generated.valuedomains.mydatamodel.PersonID;
import edmafiles.generated.valuedomains.mydatamodel.PersonList;
import edmafiles.generated.valuedomains.mydatamodel.Teacher;
import edmafiles.generated.valuedomains.mydatamodel.TeacherID;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 
 */
public class MyDataModelClientInstance implements MyDataModel
{
    private String edma_hostname;
    private int edma_port;



    /**
     * Constructor
     * @param edma_hostname  Name of the server host
     * @param edma_port      port to connect to
     */
    public MyDataModelClientInstance(String edma_hostname, int edma_port)
    {
        this.edma_hostname = edma_hostname;
        this.edma_port = edma_port;
    }

    /**
     * View all Persons
     * @return  
     */
    public GetAllPersonsResult getAllPersons() throws IOException
    {
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(0);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        PersonList out_personList = PersonList.fromStreamNoValidate(edma_in);
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteGetAllPersonsResult(errorCode, errorMsg, errorDesc, out_personList);
    }

    /**
     * View all Courses
     * @return  
     */
    public GetAllCoursesResult getAllCourses() throws IOException
    {
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(1);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        CourseList out_courseList = CourseList.fromStreamNoValidate(edma_in);
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteGetAllCoursesResult(errorCode, errorMsg, errorDesc, out_courseList);
    }

    /**
     * View all Students on Course
     * @param courseID  Input parameter courseID
     * @return          
     */
    public GetCourseStudentsResult getCourseStudents(CourseID courseID) throws IOException
    {
        if(courseID == null)
        {
            throw new NullPointerException("courseID may not be null");
        }
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(2);
        courseID.toStream(edma_out);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        PersonList out_studentList = PersonList.fromStreamNoValidate(edma_in);
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteGetCourseStudentsResult(errorCode, errorMsg, errorDesc, out_studentList);
    }

    /**
     * View Teacher for Course
     * @param courseID  Input parameter courseID
     * @return          
     */
    public GetCourseTeacherResult getCourseTeacher(CourseID courseID) throws IOException
    {
        if(courseID == null)
        {
            throw new NullPointerException("courseID may not be null");
        }
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(3);
        courseID.toStream(edma_out);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        Teacher out_teacher = null;
        if(edma_in.readBoolean()) out_teacher = Teacher.fromStreamNoValidate(edma_in);
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteGetCourseTeacherResult(errorCode, errorMsg, errorDesc, out_teacher);
    }

    /**
     * Creates a new person
     * @param firstName  Input parameter firstName
     * @param lastName   Input parameter lastName
     * @param email      Input parameter email
     * @return           
     */
    public CreatePersonResult createPerson(Name firstName, Name lastName, Email email) throws IOException
    {
        if(firstName == null)
        {
            throw new NullPointerException("firstName may not be null");
        }
        if(lastName == null)
        {
            throw new NullPointerException("lastName may not be null");
        }
        if(email == null)
        {
            throw new NullPointerException("email may not be null");
        }
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(4);
        firstName.toStream(edma_out);
        lastName.toStream(edma_out);
        email.toStream(edma_out);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        PersonID out_id = PersonID.fromStreamNoValidate(edma_in);
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteCreatePersonResult(errorCode, errorMsg, errorDesc, out_id);
    }

    /**
     * Creates a new teacher
     * @param firstName  Input parameter firstName
     * @param lastName   Input parameter lastName
     * @param email      Input parameter email
     * @return           
     */
    public CreateTeacherResult createTeacher(Name firstName, Name lastName, Email email) throws IOException
    {
        if(firstName == null)
        {
            throw new NullPointerException("firstName may not be null");
        }
        if(lastName == null)
        {
            throw new NullPointerException("lastName may not be null");
        }
        if(email == null)
        {
            throw new NullPointerException("email may not be null");
        }
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(5);
        firstName.toStream(edma_out);
        lastName.toStream(edma_out);
        email.toStream(edma_out);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        TeacherID out_id = TeacherID.fromStreamNoValidate(edma_in);
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteCreateTeacherResult(errorCode, errorMsg, errorDesc, out_id);
    }

    /**
     * Creates a new course
     * @param name  Input parameter name
     * @return      
     */
    public CreateCourseResult createCourse(Name name) throws IOException
    {
        if(name == null)
        {
            throw new NullPointerException("name may not be null");
        }
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(6);
        name.toStream(edma_out);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        CourseID out_id = CourseID.fromStreamNoValidate(edma_in);
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteCreateCourseResult(errorCode, errorMsg, errorDesc, out_id);
    }

    /**
     * Assigns a Student to a Course
     * @param studentID  Input parameter studentID
     * @param courseID   Input parameter courseID
     * @return           
     */
    public AssignStudentToCourseResult assignStudentToCourse(PersonID studentID, CourseID courseID) throws IOException
    {
        if(studentID == null)
        {
            throw new NullPointerException("studentID may not be null");
        }
        if(courseID == null)
        {
            throw new NullPointerException("courseID may not be null");
        }
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(7);
        studentID.toStream(edma_out);
        courseID.toStream(edma_out);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteAssignStudentToCourseResult(errorCode, errorMsg, errorDesc);
    }

    /**
     * Assigns the Teacher for the Course
     * @param teacherID  Input parameter teacherID
     * @param courseID   Input parameter courseID
     * @return           
     */
    public AssignTeacherToCourseResult assignTeacherToCourse(TeacherID teacherID, CourseID courseID) throws IOException
    {
        if(teacherID == null)
        {
            throw new NullPointerException("teacherID may not be null");
        }
        if(courseID == null)
        {
            throw new NullPointerException("courseID may not be null");
        }
        Socket edma_socket = new Socket(edma_hostname, edma_port);
        BufferedInputStream buf_in = new BufferedInputStream(edma_socket.getInputStream());
        DataInput edma_in = new DataInputStream(buf_in);
        BufferedOutputStream buf_out = new BufferedOutputStream(edma_socket.getOutputStream());
        DataOutput edma_out = new DataOutputStream(buf_out);
        edma_out.writeInt(8);
        teacherID.toStream(edma_out);
        courseID.toStream(edma_out);
        buf_out.flush();
        if(!edma_in.readBoolean())
        {
            String edma_error = edma_in.readUTF();
            buf_out.close();
            buf_in.close();
            edma_socket.close();
            throw new IOException(edma_error);
        }
        int errorCode = edma_in.readInt();
        String errorMsg = edma_in.readUTF();
        String errorDesc = null;
        if(edma_in.readBoolean())
        {
            errorDesc = edma_in.readUTF();
        }
        buf_out.close();
        buf_in.close();
        edma_socket.close();
        return new RemoteAssignTeacherToCourseResult(errorCode, errorMsg, errorDesc);
    }
}
