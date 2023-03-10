package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b35ed9c3-a11d-4cc4-a4ef-114fc87c3bb3")
public class TypeModelExporter<T extends TypeModel> extends SubModelExporter<T> {
    @objid ("5e6fa4c7-f35c-430f-b149-d23ab80bd9a4")
    public TypeModelExporter(T elt) {
        super(elt);
    }

    @objid ("2d7b91c0-6e9f-4ea6-9577-7cd9cc8d8c3e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createTypeModel();
    }

    @objid ("f178d929-2240-4b8c-b531-2d1ec671e8b6")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("a3084f03-d73e-47d8-8be7-7a919251b4b7")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.type.TypeModel)) {
            ((camel.core.CamelModel) context).getTypeModels().add((camel.type.TypeModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
