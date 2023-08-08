package net.media.training.designpattern.adapter;

import net.media.training.designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class ThirdPartyAdapter implements LeaveRecord {
    private ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public ThirdPartyAdapter(ThirdPartyLeaveRecord leaveRecord) {
        this.thirdPartyLeaveRecord = leaveRecord;
    }

    public String getMostAbsentEmployee() {
        return thirdPartyLeaveRecord.getMostAbsentEmployee().getName();
    }

    public int getEmployeeAbsences(String employeeName) {
        Employee employee = new Employee(employeeName);
        return thirdPartyLeaveRecord.getEmployeeAbsences(employee);
    }
}