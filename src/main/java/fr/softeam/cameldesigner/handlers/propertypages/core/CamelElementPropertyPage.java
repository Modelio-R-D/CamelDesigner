package fr.softeam.cameldesigner.handlers.propertypages.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.handlers.propertypages.IPropertyContent;

public class CamelElementPropertyPage<T extends CamelElement> implements IPropertyContent {

    protected int _currentRow;

    protected T _element;

    private final String _ownerSeparator = ".";

    private final String _eltSeparator = ";";

    protected final String _add = "Add ";

    protected final String _remove = "Remove ";

    protected final String _removeAll = "Remove all";

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
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
    @Override
    public void update(IModulePropertyTable table) {
        table.addProperty("Name",   getValue(this._element.getElement().getName()));
    }

    public CamelElementPropertyPage(T elt) {
        this._element = elt;
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
        return elt.getCompositionOwner().getName() + this._ownerSeparator + elt.getName();
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
        String name = camelName.replaceFirst(this._add, "").replaceFirst(this._remove, "");

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
