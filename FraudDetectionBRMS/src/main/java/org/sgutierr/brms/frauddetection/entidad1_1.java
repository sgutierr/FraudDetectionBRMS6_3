package org.sgutierr.brms.frauddetection;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(ba8987240cebd73e2bd5a1f0dc0c4131)
 */
@org.kie.api.definition.type.Label(value = "entidad1_1")
public class entidad1_1  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "att1")
    @org.kie.api.definition.type.Position(value = 0)
    private org.sgutierr.brms.frauddetection.entidad1_1_1 att1;
    
    @org.kie.api.definition.type.Label(value = "att2")
    @org.kie.api.definition.type.Position(value = 1)
    private org.sgutierr.brms.frauddetection.entidad1_1_2 att2;

    public entidad1_1() {
    }

    public entidad1_1(org.sgutierr.brms.frauddetection.entidad1_1_1 att1, org.sgutierr.brms.frauddetection.entidad1_1_2 att2) {
        this.att1 = att1;
        this.att2 = att2;
    }


    
    public org.sgutierr.brms.frauddetection.entidad1_1_1 getAtt1() {
        return this.att1;
    }

    public void setAtt1(org.sgutierr.brms.frauddetection.entidad1_1_1 att1) {
        this.att1 = att1;
    }
    
    public org.sgutierr.brms.frauddetection.entidad1_1_2 getAtt2() {
        return this.att2;
    }

    public void setAtt2(org.sgutierr.brms.frauddetection.entidad1_1_2 att2) {
        this.att2 = att2;
    }
}