package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("97801d92-3f80-457b-b9cd-7185e10ff16e")
public class NonFunctionalEventExporter<T extends NonFunctionalEvent> extends FeatureExporter<T> {
    @objid ("b00718f3-95f8-435c-a872-8a06ab265ebc")
    public NonFunctionalEventExporter(T elt) {
        super(elt);
    }

    @objid ("c5ac946e-a4fd-4773-b54c-384482a53f9e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createNonFunctionalEvent();
    }

    @objid ("5ff9e145-a832-4bc4-b768-79bf0ed73714")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("3087464c-d84f-4a31-bdc7-62df47a9b617")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
