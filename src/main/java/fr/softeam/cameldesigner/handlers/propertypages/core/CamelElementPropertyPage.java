package fr.softeam.cameldesigner.handlers.propertypages.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.handlers.propertypages.IPropertyContent;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("d51e7b87-847f-4c69-9032-576d613031b3")
public class CamelElementPropertyPage<T extends CamelElement> implements IPropertyContent {
    @objid ("fce1f69e-9bd3-4777-a87f-d74050de575f")
    protected int _currentRow;

    @objid ("e05a504c-efa1-4f47-b866-b59139e0e115")
    protected T _element;

    @objid ("a5f3a8ba-f147-496b-bc82-430df9d089f7")
    private final String _ownerSeparator = ".";

    @objid ("43e9c34e-77a8-4d44-b0c8-e257d61e5c46")
    private final String _eltSeparator = ";";

    @objid ("34f24e8e-bae0-4a85-bcb7-cf094ac3e86a")
    protected final String _add = "Add ";

    @objid ("e9ceee31-9548-4c1f-99be-80907e9ada42")
    protected final String _remove = "Remove ";

    @objid ("f6ee32a6-63cb-4481-9e07-44ae0d3e66bd")
    protected final String _removeAll = "Remove all";

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("0146629a-8759-42b5-acfd-ce7cd8528d9e")
    public void changeProperty(int row, String value) {
        this._currentRow = row;
        if(row == 1){
            this._element.getElement().setName(value);
        }
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("ba1a4d37-3f84-42a7-a42e-adf57260b2c8")
    @Override
    public void update(IModulePropertyTable table) {
        table.addProperty("Name",   getValue(this._element.getElement().getName()));
    }

    @objid ("e3ac2bcb-dc67-404e-abb9-a048b7ab1f80")
    public CamelElementPropertyPage(T elt) {
        this._element = elt;
    }

    @objid ("5bc21a83-568c-45f0-a003-dee26d0f1049")
    protected String getValue(String value) {
        if (value == null)
            return "";
        return value;
    }

    /**
     * Compute the name of the Camel Element
     * 
     * @param elt : the Camel Element
     * @return the computed name
     */
    @objid ("63465302-ef53-48ba-91db-d06408400e1c")
    protected String getCamelName(CamelElement elt) {
        if (elt != null) {
            return getCamelName(elt.getElement());
        }else {
            return "";
        }
    }

    /**
     * Compute the name of the Model Element
     * 
     * @param elt : the model Element
     * @return the computed name
     */
    @objid ("3e53d4ff-c9c1-48e0-ab3a-14aa0cf12fbb")
    protected String getCamelName(ModelElement elt) {
        return elt.getCompositionOwner().getName() + this._ownerSeparator + elt.getName();
    }

    /**
     * REturn the array of Camel name
     * @param elt : the list of Camel Element
     * 
     * @return the array of Camel name
     */
    @objid ("af1c3c3f-3d4d-42be-b79b-40c1eb82fb07")
    protected String[] getCamelNames(List<? extends ModelElement> elts) {
        List<String> result = new ArrayList<>();
        result.add(" ");
        for (ModelElement elt : elts) {
            result.add(getCamelName(elt));
        }
        return result.toArray(new String[result.size()]);
    }

    @objid ("7e9b0167-8353-43df-b788-b62f9fb9fef9")
    protected ModelElement getModelElt(List<? extends ModelElement> elts, String camelName) {
        String name = camelName.replaceFirst(this._add, "").replaceFirst(this._remove, "");
        
        for (ModelElement elt : elts) {
            if (getCamelName(elt).equals(name)) {
                return elt;
            }
        }
        return null;
    }

    @objid ("209094d4-879c-4d76-b45d-8de6cdad52ab")
    protected ModelElement getElt(List<ModelElement> elts, String name) {
        for (ModelElement elt : elts) {
            if (getCamelName(elt).equals(name))
                return elt;
        }
        return null;
    }

    @objid ("d4ba2ef9-30f1-4099-8e4f-b4e9ba75fd3a")
    protected String[] getAddRemove(List<ModelElement> allElt, List<? extends CamelElement> added) {
        // List of added Elts , remove Elts
        List<String> result = new ArrayList<>();
        result.add("");
        result.add(this._removeAll);
        
        //List of already added Elt
        List<ModelElement> addElt = new ArrayList<>();
        for (CamelElement elt : added) {
            addElt.add(elt.getElement());
        }
        
        //Compute the list of Added and Removed Elements
        for (ModelElement elt : allElt) {
            if (addElt.contains(elt)) {
                result.add(this._remove + getCamelName(elt));
            }else {
                result.add(this._add + getCamelName(elt));
            }
        }
        return result.toArray(new String[result.size()]);
    }

    @objid ("0d0d555c-adfb-4864-887c-2c7aac564f14")
    protected String getCamelValue(List<? extends CamelElement> elts) {
        String result = "";
        Iterator<? extends CamelElement> it = elts.iterator();
        
        if (it.hasNext()) {
            result += getCamelName(it.next());
        }
        
        while (it.hasNext()) {
            result +=  this._eltSeparator + getCamelName(it.next());
        }
        return result;
    }

    @objid ("478cb49a-be51-4d1c-9a7a-a9ed4e2f37ae")
    protected CamelElement getCamelElt(List<? extends CamelElement> elts, String camelName) {
        String name = camelName.replaceFirst(this._add, "").replaceFirst(this._remove, "");
        
        for (CamelElement elt : elts) {
            if (getCamelName(elt).equals(name)) {
                return elt;
            }
        }
        return null;
    }

}
