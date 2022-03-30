package fr.softeam.cameldesigner.audit.report;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d68b5226-44bc-4993-a9d3-0a2de776a24e")
public interface IReportWriter {
    @objid ("83c1cade-01f5-4889-be82-c6d9c1a219e0")
    void addWarning(String Id, MObject element, String description);

    @objid ("033539fa-b07d-4252-980e-73bc01b65eb8")
    void addError(String Id, MObject element, String description);

    @objid ("d0ecacd5-d863-434e-bfda-5dfb0454cfca")
    void addInfo(String Id, MObject element, String description);

    @objid ("bb20db36-8fbd-47af-9154-10a1c5c1190d")
    boolean isEmpty();

    @objid ("fc76b56b-247b-4b99-8cc4-9262beb03b2d")
    boolean hasErrors();

    @objid ("0eb70896-cd81-49f1-a372-18c32620f67e")
    boolean hasWarnings();

    @objid ("507760fe-e58b-4f32-978d-c7fa9fc1a053")
    boolean hasInfos();

}
