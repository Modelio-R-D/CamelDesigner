package fr.softeam.cameldesigner.handlers.propertypages.metadata;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("53f0d1f2-8f76-43b0-b222-759fd70e5b7a")
public class MmsPropertyInstancePropertyPage<T extends MmsPropertyInstance> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("88b4e7e4-ab07-4290-901c-51ec433956e2")
    private List<ModelElement> _conceptInstance = null;

    @objid ("32fb5469-aaf1-4173-9bd2-1f592f048f0e")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.;
            break;
        
        case 2 :
            this._element.setPropertyValue(value);
            break;
        
        case 3 :
            ModelElement elt = getModelElt(this._conceptInstance, value);
            if (MmsConceptInstance.canInstantiate(elt)) {
                this._element.setConceptInstance(MmsConceptInstance.safeInstantiate((Instance)elt));
                }
            break;
        
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
        table.addProperty("Is A",getValue(this._element));
        
        
        //Property Value
        table.addProperty("Property Value",getValue(this._element.getPropertyValue()));
        
        //Concept Instance
        this._conceptInstance = MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Concept Instance", getCamelName(this._element.getConceptInstance()), getCamelNames(this._conceptInstance));
    }

    @objid ("a7f7392d-dcd1-4391-b8a2-a5fe2f453e0b")
    public MmsPropertyInstancePropertyPage(T elt) {
        super(elt);
    }

}
