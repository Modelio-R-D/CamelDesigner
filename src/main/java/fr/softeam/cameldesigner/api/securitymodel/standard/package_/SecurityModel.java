/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << SecurityModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("558acef6-15e9-4032-97b3-66eea7c497d6")
public class SecurityModel extends SubModel {
    @objid ("191dcea9-4ce2-4e79-aa99-5caf10d0759d")
    public static final String STEREOTYPE_NAME = "SecurityModel";

    /**
     * Tells whether a {@link SecurityModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << SecurityModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a0de2f76-f48d-4995-963a-0a0f5c3542ac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << SecurityModel >> then instantiate a {@link SecurityModel} proxy.
     * 
     * @return a {@link SecurityModel} proxy on the created {@link Package}.
     */
    @objid ("0b8f973a-a201-4c44-a5f9-b01e20868059")
    public static SecurityModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityModel.STEREOTYPE_NAME);
        return SecurityModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link SecurityModel} proxy from a {@link Package} stereotyped << SecurityModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link SecurityModel} proxy or <i>null</i>.
     */
    @objid ("3a1fa0e0-f19f-4551-82c1-cd6acc61064e")
    public static SecurityModel instantiate(final Package obj) {
        return SecurityModel.canInstantiate(obj) ? new SecurityModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityModel} proxy from a {@link Package} stereotyped << SecurityModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link SecurityModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d95f255a-8da0-4e93-a18f-8dcd23d0f985")
    public static SecurityModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (SecurityModel.canInstantiate(obj))
        	return new SecurityModel(obj);
        else
        	throw new IllegalArgumentException("SecurityModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'compositeSecurityInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b7ab98ec-7128-4e33-aca2-07b36864d3a9")
    public void addCompositeSecurityInstances(final CompositeSecurityMetric obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("52340c4e-2100-45e1-bb60-a790de733b27")
    public void addRawSecurityMetrics(final RawSecurityMetric obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityAttributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fa506e2b-950a-48c8-ac87-86d9d525f63e")
    public void addSecurityAttributes(final SecurityAttribute obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1f175996-46c2-4ad0-88d5-55833180f546")
    public void addSecurityControls(final SecurityControl obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityDomains' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f6f1eb33-df33-419f-92a7-6f7b000c25a9")
    public void addSecurityDomains(final SecurityDomain obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b801f888-5cf5-4885-be52-eec8102acda4")
    public void addSecurityMetricInstances(final SecurityMetricInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityRequirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ee39e700-2a7e-4ae8-b63f-7a976f936efd")
    public void addSecurityRequirements(final SecurityRequirement obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securitySLOs' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("311f1de9-f0bc-415f-8bfe-6b31cefc7586")
    public void addSecuritySLOs(final SecuritySLO obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("aca7c1c6-2f90-4b73-b0df-eee3a1ec2417")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SecurityModel other = (SecurityModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("58bd0cb3-aa23-4a3c-8f4f-300f28bfb1aa")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'compositeSecurityInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f817356c-b149-49bc-a107-bad23478ab36")
    public List<CompositeSecurityMetric> getCompositeSecurityInstances() {
        List<CompositeSecurityMetric> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (CompositeSecurityMetric.canInstantiate(mObj))
        			results.add((CompositeSecurityMetric)CamelDesignerProxyFactory.instantiate(mObj, CompositeSecurityMetric.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("f602ee22-8dfa-4469-91a8-758ea5724533")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("331c5a40-b37d-4bae-ba36-6813766ba39b")
    public List<RawSecurityMetric> getRawSecurityMetrics() {
        List<RawSecurityMetric> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (RawSecurityMetric.canInstantiate(mObj))
        			results.add((RawSecurityMetric)CamelDesignerProxyFactory.instantiate(mObj, RawSecurityMetric.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityAttributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2ef81252-9755-4f91-8393-a5c62ec161b4")
    public List<SecurityAttribute> getSecurityAttributes() {
        List<SecurityAttribute> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Certifiable.canInstantiate(mObj))
        			results.add((Certifiable)CamelDesignerProxyFactory.instantiate(mObj, Certifiable.STEREOTYPE_NAME));
        	if (SecurityAttribute.canInstantiate(mObj))
        			results.add((SecurityAttribute)CamelDesignerProxyFactory.instantiate(mObj, SecurityAttribute.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("32a27f30-4776-41e2-b632-ce2f4fdd8cc1")
    public List<SecurityControl> getSecurityControls() {
        List<SecurityControl> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecurityControl.canInstantiate(mObj))
        			results.add((SecurityControl)CamelDesignerProxyFactory.instantiate(mObj, SecurityControl.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityDomains' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6e172278-8e83-450c-888d-aea52fa5f998")
    public List<SecurityDomain> getSecurityDomains() {
        List<SecurityDomain> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecurityDomain.canInstantiate(mObj))
        			results.add((SecurityDomain)CamelDesignerProxyFactory.instantiate(mObj, SecurityDomain.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3e51c867-5355-43a3-9b8c-a78bd32e81b9")
    public List<SecurityMetricInstance> getSecurityMetricInstances() {
        List<SecurityMetricInstance> results = new ArrayList<>();
        for (Instance mObj : ((Package) this.elt).getDeclared()){
        	if (SecurityMetricInstance.canInstantiate(mObj))
        			results.add((SecurityMetricInstance)CamelDesignerProxyFactory.instantiate(mObj, SecurityMetricInstance.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityRequirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("10dce469-be99-4019-8a7b-7624c70a0856")
    public List<SecurityRequirement> getSecurityRequirements() {
        List<SecurityRequirement> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecurityRequirement.canInstantiate(mObj))
        			results.add((SecurityRequirement)CamelDesignerProxyFactory.instantiate(mObj, SecurityRequirement.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securitySLOs' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e75d123d-8294-420d-8391-f37c8bd3c8e6")
    public List<SecuritySLO> getSecuritySLOs() {
        List<SecuritySLO> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecuritySLO.canInstantiate(mObj))
        			results.add((SecuritySLO)CamelDesignerProxyFactory.instantiate(mObj, SecuritySLO.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("8627a33b-522f-4932-a89d-642ca2d694f7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'compositeSecurityInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("06c397b7-eb54-4580-8608-2ada324c547d")
    public boolean removeCompositeSecurityInstances(final CompositeSecurityMetric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("db66802b-dbd3-4764-9d0f-37ae86ff0cc0")
    public boolean removeRawSecurityMetrics(final RawSecurityMetric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityAttributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2ac724ec-e868-4467-ac5c-a5882f0f2112")
    public boolean removeSecurityAttributes(final SecurityAttribute obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b01b8eb3-47d4-4b33-96ce-efc4b96a43af")
    public boolean removeSecurityControls(final SecurityControl obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityDomains' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f9378e76-6f81-4127-99c1-8cc35041c80f")
    public boolean removeSecurityDomains(final SecurityDomain obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("111e65ce-f8e2-4c4e-b4df-5ae1b16f00f5")
    public boolean removeSecurityMetricInstances(final SecurityMetricInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityRequirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("31db9d60-319f-4ad7-8781-b2d2583b495e")
    public boolean removeSecurityRequirements(final SecurityRequirement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securitySLOs' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("363a9a5f-eb04-46a2-928f-184bc3f5f62b")
    public boolean removeSecuritySLOs(final SecuritySLO obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5f682f2e-7895-4fae-a4a6-dadada73637c")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("d6494135-6e9c-4ee4-a29e-8acb056b462c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getSecurityControls());
        result.addAll(getSecurityRequirements());
        result.addAll(getSecurityAttributes());
        result.addAll(getRawSecurityMetrics());
        result.addAll(getCompositeSecurityInstances());
        result.addAll(getSecurityMetricInstances());
        result.addAll(getSecurityDomains());
        result.addAll(getSecuritySLOs());
        return result;
    }

    @objid ("1914d8e3-ccdc-4d9e-bcd0-58cd889f6805")
    protected SecurityModel(final Package elt) {
        super(elt);
    }

    @objid ("2405f496-8209-4c75-b1e1-0df64f112617")
    public static final class MdaTypes {
        @objid ("20db0553-3c51-400a-8fbc-b9a3200bef5f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("528a0e95-fb57-41e1-a3b5-cafc60a556f5")
        private static Stereotype MDAASSOCDEP;

        @objid ("506f818c-4eee-4694-8aca-67d3682bde28")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f01f542d-34e1-444a-accf-e0f39c098a8b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "61f4f16b-0ac0-4a06-a279-b5b28dc86d01");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
