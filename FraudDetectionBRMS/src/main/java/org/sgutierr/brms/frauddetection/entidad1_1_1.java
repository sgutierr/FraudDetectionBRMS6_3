package org.sgutierr.brms.frauddetection;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(b8612e86754966a1d92574582fc839fb)
 */
@org.kie.api.definition.type.Label(value = "entidad1_1_1")
public class entidad1_1_1  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "att1")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String att1;
    
    @org.kie.api.definition.type.Label(value = "att2")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String att2;

    public entidad1_1_1() {
    }

    public entidad1_1_1(java.lang.String att1, java.lang.String att2) {
        this.att1 = att1;
        this.att2 = att2;
    }


    
    public java.lang.String getAtt1() {
        return this.att1;
    }

    public void setAtt1(java.lang.String att1) {
        this.att1 = att1;
    }
    
    public java.lang.String getAtt2() {
        return this.att2;
    }

    public void setAtt2(java.lang.String att2) {
        this.att2 = att2;
    }
}