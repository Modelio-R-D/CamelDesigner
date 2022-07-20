package fr.softeam.cameldesigner.exchange.exporter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("4f8da10e-3712-4da0-a73c-880faa47c543")
public class GenerateMap {
    @objid ("7a0757e8-ddd7-4deb-8760-e5ba6f815101")
    private Map<ModelElement , CDOObject> modelMap;

    @objid ("0a0c521c-e57e-4261-82e8-4e40d0f4939f")
    private static GenerateMap theSingleInstance;

    @objid ("1e184643-e1bf-49da-93e9-a2eabc3e62a8")
    public void clear() {
        this.modelMap.clear();
    }

    @objid ("ed50b597-6219-4141-94c0-7ef1c5364475")
    public boolean containsKey(ModelElement key) {
        return  this.modelMap.containsKey(key);
    }

    @objid ("e314ae3d-5684-4e8d-9dac-1fc75a2cbe8b")
    public boolean containsValue(CDOObject val) {
        return  this.modelMap.containsValue(val);
    }

    @objid ("87e72af7-a2b7-444e-be69-05e9b8d6a989")
    public CDOObject get(ModelElement key) {
        return  this.modelMap.get(key);
    }

    @objid ("980cc077-c869-4c0f-854e-391c9b4310b4")
    public static GenerateMap getInstance() {
        if (theSingleInstance == null)
            theSingleInstance = new GenerateMap();
        return theSingleInstance;
    }

    @objid ("71ee9197-212e-4cf7-bb8f-61b7d1d4cc38")
    public boolean isEmpty() {
        return  this.modelMap.isEmpty();
    }

    @objid ("60371c93-8208-4ccb-95cb-cd9d0ef989e7")
    public Set<ModelElement> keySet() {
        return  this.modelMap.keySet();
    }

    @objid ("9166db97-32c9-4c29-88c6-b66d9127bd2e")
    public CDOObject put(ModelElement key, CDOObject value) {
        return  this.modelMap.put(key, value);
    }

    @objid ("cb201db1-94a4-45b2-b1d0-aedebf73d205")
    public CDOObject remove(ModelElement key) {
        return  this.modelMap.remove(key);
    }

    @objid ("f7a9cab5-a17c-4374-a973-4d8af2d5cf29")
    public int size() {
        return  this.modelMap.size();
    }

    @objid ("b8d3db05-d64b-4962-8f9b-0ea60773d96b")
    public Collection<CDOObject> values() {
        return  this.modelMap.values();
    }

    @objid ("eb0d0630-a206-48c7-92ef-bfe6078fc2e3")
    private GenerateMap() {
        this.modelMap = new HashMap<>();
    }

}
