package fr.softeam.cameldesigner.exchange.exporter.organisation;

import java.util.ArrayList;
import java.util.List;
import camel.organisation.OrganisationFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("98d0f82a-f17f-4616-a18c-ab0d96347e08")
public class DataResourceFilterExporter<T extends DataResourceFilter> extends ResourceFilterExporter<T> {
    @objid ("ab955ee1-7c35-4cfe-a848-8843e9a9d0c0")
    public DataResourceFilterExporter(T elt) {
        super(elt);
    }

    @objid ("835ad362-ec6a-448b-bc3b-ae432a2b6d2b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return OrganisationFactory.eINSTANCE.createDataResourceFilter();
    }

    @objid ("45c2c81b-5ecb-4042-aea9-adb4f169151a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.organisation.DataResourceFilter) {
            camel.organisation.DataResourceFilter drf = (camel.organisation.DataResourceFilter) elt;
            setEveryData(drf);
            setData(drf);
            setDataInstance(drf);
            setLocation(drf);
        }
    }

    @objid ("4076af49-c897-4611-92e7-b47a9c6d2166")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("52886a6d-a94e-4399-a76b-3b96eeaf7157")
    private void setData(camel.organisation.DataResourceFilter drf) {
        List<camel.data.Data> datas = new ArrayList<>();
        for (Data data : this._element.getData()) {
            CDOObject camelData = this._process.getElement(data);
            if ((camelData != null) &&  (camelData instanceof camel.data.Data))
                datas.add((camel.data.Data) camelData);
        }
        
        drf.getData().addAll(datas);
    }

    @objid ("f6b35e20-4263-4539-8c58-afbbabc85d4b")
    private void setDataInstance(camel.organisation.DataResourceFilter drf) {
        List<camel.data.DataInstance> dataInstances = new ArrayList<>();
        for (DataInstance dataInstance : this._element.getDataInstances()) {
            CDOObject camelDataInstance = this._process.getElement(dataInstance);
            if ((camelDataInstance != null) &&  (camelDataInstance instanceof camel.data.DataInstance))
                dataInstances.add((camel.data.DataInstance) camelDataInstance);
        }
        
        drf.getDataInstances().addAll(dataInstances);
    }

    @objid ("efddcd18-ee4a-410d-ae35-822e1102f8bf")
    private void setLocation(camel.organisation.DataResourceFilter drf) {
        List<camel.location.Location> locations = new ArrayList<>();
        for (Location location : this._element.getLocations()) {
            CDOObject camelLocation = this._process.getElement(location);
            if ((camelLocation != null) &&  (camelLocation instanceof camel.location.Location))
                locations.add((camel.location.Location) camelLocation);
        }
        
        drf.getLocations().addAll(locations);
    }

    @objid ("f83f793c-aa2e-4dda-8f4b-488af372ccd0")
    private void setEveryData(camel.organisation.DataResourceFilter dataFilter) {
        dataFilter.setEveryData(this._element.isEveryData());
    }

}
