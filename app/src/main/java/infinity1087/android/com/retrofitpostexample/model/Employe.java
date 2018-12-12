package infinity1087.android.com.retrofitpostexample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employe {


    @SerializedName("employees")
    @Expose
    private List<EmployeResult> employees = null;

    public List<EmployeResult> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeResult> employees) {
        this.employees = employees;
    }


}
