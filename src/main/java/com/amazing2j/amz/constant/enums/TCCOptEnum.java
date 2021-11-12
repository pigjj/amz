package com.amazing2j.amz.constant.enums;

import com.amazing2j.amz.constant.consist.TCCOpt;

public enum TCCOptEnum {
    OPT_TRY(TCCOpt.TRY),
    OPT_CONFIRM(TCCOpt.CONFIRM),
    OPT_CANCEL(TCCOpt.CANCEL),
    ;
    private String opt;

    TCCOptEnum(String opt) {
        this.opt = opt;
    }

    public String getOpt() {
        return opt;
    }

    public void setOpt(String opt) {
        this.opt = opt;
    }
}