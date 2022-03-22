package fr.softeam.cameldesigner.exchange.exporter.security;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.security.SecurityFactory;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;

@objid ("7d098415-7c67-45ea-846c-dee26ba16e16")
public class SecurityControlExporter<T extends SecurityControl> extends FeatureExporter<T> {
    @objid ("9fafa24c-5b4d-4681-a8df-e39db55ca5de")
    public SecurityControlExporter(T elt) {
        super(elt);
    }

    @objid ("4bb8911c-5b36-4f23-97e7-3764d520475b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return SecurityFactory.eINSTANCE.createSecurityControl();
    }

    @objid ("028fab79-c653-4ac5-8e6b-cc150b4d3911")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.security.SecurityControl) {
            camel.security.SecurityControl sc = (camel.security.SecurityControl) elt;
            setId(sc);
            setDomain(sc);
            setSubDomain(sc);
            setSpecification(sc);
            setSecurityProperties(sc);
            setRawSecurityProperties(sc);
            setCompositeSecurityMetrics(sc);
        }
    }


    private void setCompositeSecurityMetrics(camel.security.SecurityControl sc) {
        List<camel.security.CompositeSecurityMetric> props = new ArrayList<>();
        for (CompositeSecurityMetric secAtt : this._element.getCompositeSecurityMetrics()) {
            CDOObject camelSecAtt = this._process.getElement(secAtt);
            if ((secAtt != null) &&  (secAtt instanceof camel.security.CompositeSecurityMetric))
                props.add((camel.security.CompositeSecurityMetric) camelSecAtt);
        }

        sc.getCompositeSecurityMetrics().addAll(props);
    }

    private void setSecurityProperties(camel.security.SecurityControl sc) {
        List<camel.security.SecurityAttribute> props = new ArrayList<>();
        for (SecurityAttribute secAtt : this._element.getSecurityProperties()) {
            CDOObject camelSecAtt = this._process.getElement(secAtt);
            if ((secAtt != null) &&  (secAtt instanceof camel.security.SecurityAttribute))
                props.add((camel.security.SecurityAttribute) camelSecAtt);
        }

        sc.getSecurityProperties().addAll(props);
    }

    private void setRawSecurityProperties(camel.security.SecurityControl sc) {
        List<camel.security.RawSecurityMetric> props = new ArrayList<>();
        for (RawSecurityMetric secAtt : this._element.getRawSecurityMetrics()) {
            CDOObject camelSecAtt = this._process.getElement(secAtt);
            if ((secAtt != null) &&  (secAtt instanceof camel.security.RawSecurityMetric))
                props.add((camel.security.RawSecurityMetric) camelSecAtt);
        }

        sc.getRawSecurityMetrics().addAll(props);
    }

    private void setSpecification(camel.security.SecurityControl sc) {
        String content = this._element.getSpecification();
        if (content != null) {
            sc.setSpecification(content);
        }
    }

    private void setSubDomain(camel.security.SecurityControl sc) {
        CDOObject domain = this._process.getElement(this._element.getSubDomain());
        if ((domain != null) &&  (domain instanceof camel.security.SecurityDomain))
            sc.setSubDomain((camel.security.SecurityDomain) domain);
    }

    private void setDomain(camel.security.SecurityControl sc) {
        CDOObject domain = this._process.getElement(this._element.getDomain());
        if ((domain != null) &&  (domain instanceof camel.security.SecurityDomain))
            sc.setDomain((camel.security.SecurityDomain) domain);
    }

    private void setId(camel.security.SecurityControl sc) {
        String content = this._element.getId();
        if (content != null) {
            sc.setId(content);
        }
    }

    @objid ("9a0e3806-950b-44d2-9eee-549c396aa3d5")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.security.SecurityModel) && (elt instanceof camel.security.SecurityControl)) {
            ((camel.security.SecurityModel) context).getSecurityControls().add((camel.security.SecurityControl) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
