package fr.softeam.cameldesigner.conversion.process.reverse;

import java.util.Map;
import camel.data.Data;
import camel.data.DataSource;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class ReverseProcessDataType extends AbstractReverseProcess {
    public ReverseProcessDataType(ModelElement umlElementParent, Map<CDOObject, CamelElement> processedCamelElements) {
        super(umlElementParent, processedCamelElements);
    }

    @Override
    public CamelElement switchReverse(CDOObject element) {
        if (element instanceof DataSource){
            return reverse ((DataSource) element);
        }  else if (element instanceof Data){
            return reverse ((Data) element);
        }
        return null;
    }

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

}
