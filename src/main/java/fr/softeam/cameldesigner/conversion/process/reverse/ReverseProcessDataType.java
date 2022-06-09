package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import camel.data.Data;
import camel.data.DataSource;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;

@objid ("55fbdd24-7cd9-4ac6-94f2-52970c5c2f46")
public class ReverseProcessDataType extends AbstractReverseProcess {
    @objid ("c714ae3f-85a9-4141-bf77-5cee14809f0d")
    public ReverseProcessDataType(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @objid ("aa40c738-db34-46fa-8b4e-7f2eec167074")
    @Override
    public CamelElement switchReverse(CDOObject element) {
        if (element instanceof DataSource){
            return reverse ((DataSource) element);
        }  else if (element instanceof Data){
            return reverse ((Data) element);
        }
        return null;
    }

    @objid ("9f14928c-9498-447d-81ab-cf35ed25baaa")
    private fr.softeam.cameldesigner.api.datamodel.standard.class_.Data reverse(Data element) {
        fr.softeam.cameldesigner.api.datamodel.standard.class_.Data proxyData = fr.softeam.cameldesigner.api.datamodel.standard.class_.Data.create();
        if(proxyData != null && element.getDataSource()!= null) {
            fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource proxyDataSource = null;
            if(this.processedCamelElements.containsKey(element.getDataSource())) {
                proxyDataSource = (fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource) this.processedCamelElements.get(element.getDataSource());
            } else  {
                proxyDataSource = (fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource) (new ReverseProcessDeploymentType(null, this.processedCamelElements)).switchReverse(element.getDataSource());
                proxyDataSource.getElement().setName(element.getDataSource().getName());
                this.processedCamelElements.put(element.getDataSource(), proxyDataSource);

            }
            proxyData.setDataSource(proxyDataSource);
        }
        return proxyData;
    }

    @objid ("64eaa862-5c5a-4750-b0a1-ddefa8e79b5f")
    private fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource reverse(DataSource element) {
        fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource proxyDataSource = fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource.create();
        if(proxyDataSource != null && element.getComponent() != null) {
            SoftwareComponent umlSoftwareComponent = null;
            if(this.processedCamelElements.containsKey(element.getComponent())) {
                umlSoftwareComponent = (SoftwareComponent) this.processedCamelElements.get(element.getComponent());
            } else  {
                umlSoftwareComponent = (SoftwareComponent) (new ReverseProcessDeploymentType(null, this.processedCamelElements)).switchReverse(element.getComponent());
                umlSoftwareComponent.getElement().setName(element.getComponent().getName());
                this.processedCamelElements.put(element.getComponent(), umlSoftwareComponent);

            }
            proxyDataSource.setSoftwareComponent(umlSoftwareComponent);
        }
        return proxyDataSource;
    }

    @Override
    public Object process(Object element, Object context) {
        // TODO Auto-generated method stub
        return null;
    }

}
