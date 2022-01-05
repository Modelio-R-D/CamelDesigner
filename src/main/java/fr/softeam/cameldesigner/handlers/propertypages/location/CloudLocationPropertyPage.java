package fr.softeam.cameldesigner.handlers.propertypages.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
<<<<<<< HEAD:src/main/java/fr/softeam/cameldesigner/handlers/propertypages/location/CloudLocationPropertyPage.java
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("6742798b-5010-4709-a1d9-929b26d0ed83")
public class CloudLocationPropertyPage<T extends Location> extends LocationPropertyPage<T> {
=======
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("f0a54b54-5b3b-4e12-a776-035212a1b5b8")
public class SecurityMetricInstancePropertyPage<T extends SecurityMetricInstance> extends MetricInstancePropertyPage<T> {
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213:src/main/java/fr/softeam/cameldesigner/handlers/propertypages/metric/SecurityMetricInstancePropertyPage.java
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
<<<<<<< HEAD:src/main/java/fr/softeam/cameldesigner/handlers/propertypages/location/CloudLocationPropertyPage.java
    @objid ("78374501-d2b6-40d8-94a4-a9de16db216e")
=======
    @objid ("5f1a02be-c712-4e4f-b4a7-7329e61af5c2")
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213:src/main/java/fr/softeam/cameldesigner/handlers/propertypages/metric/SecurityMetricInstancePropertyPage.java
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
<<<<<<< HEAD:src/main/java/fr/softeam/cameldesigner/handlers/propertypages/location/CloudLocationPropertyPage.java
    @objid ("f4858ac1-63d1-4c49-821f-6c05ebec4612")
=======
    @objid ("fdc7a7ba-0f70-417d-bf6e-538f43cd328c")
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213:src/main/java/fr/softeam/cameldesigner/handlers/propertypages/metric/SecurityMetricInstancePropertyPage.java
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

<<<<<<< HEAD:src/main/java/fr/softeam/cameldesigner/handlers/propertypages/location/CloudLocationPropertyPage.java
    @objid ("3f21ac48-1cc7-489b-9fbc-36f7d8b8e7a2")
    public CloudLocationPropertyPage(T elt) {
=======
    @objid ("8d00df11-c378-4e25-a11a-e5e433694270")
    public SecurityMetricInstancePropertyPage(T elt) {
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213:src/main/java/fr/softeam/cameldesigner/handlers/propertypages/metric/SecurityMetricInstancePropertyPage.java
        super(elt);
    }

}
