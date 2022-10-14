package fr.softeam.cameldesigner.handlers.propertypages.metadata;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;

@objid ("53f0d1f2-8f76-43b0-b222-759fd70e5b7a")
public class MmsPropertyInstancePropertyPage<T extends MmsPropertyInstance> extends MmsObjectPropertyPage<T> {
    @objid ("857eb105-4132-4750-b90b-a1c5348fd8db")
    private List<ModelElement> _isA = null;

    @objid ("d589887e-e86f-4747-84d4-50165980e439")
    private List<ModelElement> _conceptInstance = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("32fb5469-aaf1-4173-9bd2-1f592f048f0e")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);

        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._isA, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsProperty.STEREOTYPE_NAME)) {
                this._element.setIsA((MmsProperty) elt);
            }
        }

        else if(this._currentRow == 2){
            this._element.setPropertyValue(value);

        }

        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(this._conceptInstance, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME)) {
                this._element.setConceptInstance((MmsConceptInstance) elt);
            }
        }
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     *
     * @param table : the property table to fulfill
     */
    @objid ("f4da08a4-956a-45a1-9016-49cf77c3729c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //Is A
        this._isA = MmsProperty.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Is A", getCamelName(this._element.getIsA()), getCamelNames(this._isA));

        //Property Value
        table.addProperty("Property Value", getNotNull(this._element.getPropertyValue()));

        //Concept Instance"
        this._conceptInstance = MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Concept Instance", getCamelName(this._element.getIsA()), getCamelNames(this._conceptInstance));
    }

    @objid ("a7f7392d-dcd1-4391-b8a2-a5fe2f453e0b")
    public MmsPropertyInstancePropertyPage(T elt) {
        super(elt);
    }

}
