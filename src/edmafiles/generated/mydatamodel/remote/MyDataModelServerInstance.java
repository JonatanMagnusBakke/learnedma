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
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.runtime.remote.IServerInstance;

/**
 * 
 */
public class MyDataModelServerInstance implements IServerInstance
{
    private MyDataModel edma_inst;



    /**
     * Constructor
     * @param edma_inst  The data model instance
     */
    public MyDataModelServerInstance(MyDataModel edma_inst)
    {
        this.edma_inst = edma_inst;
    }

    /**
     * call a method
     * @param methodID  ID of the method to call
     * @param edma_in   Stream to read input parameters from
     * @param edma_out  Stream to write output parameters to
     */
    public void call(int methodID, DataInput edma_in, DataOutput edma_out) throws IOException
    {
        switch(methodID)
        {
            case 0:
            {
                GetAllPersonsResult edma_res = edma_inst.getAllPersons();
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                PersonList out_personList = edma_res.getPersonList();
                out_personList.toStream(edma_out);
                break;
            }
            case 1:
            {
                GetAllCoursesResult edma_res = edma_inst.getAllCourses();
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                CourseList out_courseList = edma_res.getCourseList();
                out_courseList.toStream(edma_out);
                break;
            }
            case 2:
            {
                CourseID in_courseID = CourseID.fromStreamNoValidate(edma_in);
                GetCourseStudentsResult edma_res = edma_inst.getCourseStudents(in_courseID);
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                PersonList out_studentList = edma_res.getStudentList();
                out_studentList.toStream(edma_out);
                break;
            }
            case 3:
            {
                CourseID in_courseID = CourseID.fromStreamNoValidate(edma_in);
                GetCourseTeacherResult edma_res = edma_inst.getCourseTeacher(in_courseID);
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                Teacher out_teacher = edma_res.getTeacher();
                if(out_teacher == null)
                {
                    edma_out.writeBoolean(false);
                }
                else
                {
                    edma_out.writeBoolean(true);
                    out_teacher.toStream(edma_out);
                }
                break;
            }
            case 4:
            {
                Name in_firstName = Name.fromStreamNoValidate(edma_in);
                Name in_lastName = Name.fromStreamNoValidate(edma_in);
                Email in_email = Email.fromStreamNoValidate(edma_in);
                CreatePersonResult edma_res = edma_inst.createPerson(in_firstName, in_lastName, in_email);
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                PersonID out_id = edma_res.getId();
                out_id.toStream(edma_out);
                break;
            }
            case 5:
            {
                Name in_firstName = Name.fromStreamNoValidate(edma_in);
                Name in_lastName = Name.fromStreamNoValidate(edma_in);
                Email in_email = Email.fromStreamNoValidate(edma_in);
                CreateTeacherResult edma_res = edma_inst.createTeacher(in_firstName, in_lastName, in_email);
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                TeacherID out_id = edma_res.getId();
                out_id.toStream(edma_out);
                break;
            }
            case 6:
            {
                Name in_name = Name.fromStreamNoValidate(edma_in);
                CreateCourseResult edma_res = edma_inst.createCourse(in_name);
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                CourseID out_id = edma_res.getId();
                out_id.toStream(edma_out);
                break;
            }
            case 7:
            {
                PersonID in_studentID = PersonID.fromStreamNoValidate(edma_in);
                CourseID in_courseID = CourseID.fromStreamNoValidate(edma_in);
                AssignStudentToCourseResult edma_res = edma_inst.assignStudentToCourse(in_studentID, in_courseID);
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                break;
            }
            case 8:
            {
                TeacherID in_teacherID = TeacherID.fromStreamNoValidate(edma_in);
                CourseID in_courseID = CourseID.fromStreamNoValidate(edma_in);
                AssignTeacherToCourseResult edma_res = edma_inst.assignTeacherToCourse(in_teacherID, in_courseID);
                edma_out.writeBoolean(true);
                edma_out.writeInt(edma_res.errorCode());
                edma_out.writeUTF(edma_res.errorMessage());
                if(edma_res.errorDescription() != null)
                {
                    edma_out.writeBoolean(true);
                    edma_out.writeUTF(edma_res.errorDescription());
                }
                else
                {
                    edma_out.writeBoolean(false);
                }
                break;
            }
            default:
                throw new RuntimeException("Invalid method ID: " + methodID);
        }
    }
}
