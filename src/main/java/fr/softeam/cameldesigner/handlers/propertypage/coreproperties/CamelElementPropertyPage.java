package fr.softeam.cameldesigner.handlers.propertypage.coreproperties;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.handlers.propertypage.IPropertyContent;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class CamelElementPropertyPage<T extends CamelElement> implements IPropertyContent {
    protected T element;

    private final String ownerSeparator = ".";

    private final String eltSeparator = ";";

    protected final String add = "Add ";

    protected final String remove = "Remove ";

    protected final String removeAll = "Remove all";

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public int changeProperty(int row, String value) {
        if(row == 1){
            this.element.getElement().setName(value);
        }
        return row - 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * 
     * @param table : the property table to fulfill
     */
    @Override
    public void update(IModulePropertyTable table) {
        table.addProperty("Name",   getValue(this.element.getElement().getName()));
    }

    public CamelElementPropertyPage(T elt) {
        this.element = elt;
    }

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
    protected String getCamelName(ModelElement elt) {
        return elt.getCompositionOwner().getName() + this.ownerSeparator + elt.getName();
    }

    /**
     * REturn the array of Camel name
     * @param elt : the list of Camel Element
     * 
     * @return the array of Camel name
     */
    protected String[] getCamelNames(List<ModelElement> elts) {
        List<String> result = new ArrayList<>();
        result.add(" ");
        for (ModelElement elt : elts) {
            result.add(getCamelName(elt));
        }
        return result.toArray(new String[result.size()]);
    }

    protected ModelElement getModelElt(List<? extends ModelElement> elts, String camelName) {
        String name = camelName.replaceFirst(this.add, "").replaceFirst(this.remove, "");
        
        for (ModelElement elt : elts) {
            if (getCamelName(elt).equals(name)) {
                return elt;
            }
        }
        return null;
    }

    protected ModelElement getElt(List<ModelElement> elts, String name) {
        for (ModelElement elt : elts) {
            if (getCamelName(elt).equals(name))
                return elt;
        }
        return null;
    }

    protected String[] getAddRemove(List<ModelElement> allElt, List<? extends CamelElement> added) {
        // List of added Elts , remove Elts
        List<String> result = new ArrayList<>();
        result.add("");
        result.add(this.removeAll);
        
        //List of already added Elt
        List<ModelElement> addElt = new ArrayList<>();
        for (CamelElement elt : added) {
            addElt.add(elt.getElement());
        }
        
        //Compute the list of Added and Removed Elements
        for (ModelElement elt : allElt) {
            if (addElt.contains(elt)) {
                result.add(this.remove + getCamelName(elt));
            }else {
                result.add(this.add + getCamelName(elt));
            }
        }
        return result.toArray(new String[result.size()]);
    }

    protected String getCamelValue(List<? extends CamelElement> elts) {
        String result = "";
        Iterator<? extends CamelElement> it = elts.iterator();
        
        if (it.hasNext()) {
            result += getCamelName(it.next());
        }
        
        while (it.hasNext()) {
            result +=  this.eltSeparator + getCamelName(it.next());
        }
        return result;
    }

    protected CamelElement getCamelElt(List<? extends CamelElement> elts, String camelName) {
        String name = camelName.replaceFirst(this.add, "").replaceFirst(this.remove, "");
        
        for (CamelElement elt : elts) {
            if (getCamelName(elt).equals(name)) {
                return elt;
            }
        }
        return null;
    }

}
