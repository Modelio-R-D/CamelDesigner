/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram;
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
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
    @objid ("301dced0-41d3-478c-9c80-0f26da90508c")
    public static final String STEREOTYPE_NAME = "SecurityModel";

    /**
     * Tells whether a {@link SecurityModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << SecurityModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0ce685d6-1422-4687-9208-0a3eeadb82b2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << SecurityModel >> then instantiate a {@link SecurityModel} proxy.
     * 
     * @return a {@link SecurityModel} proxy on the created {@link Package}.
     */
    @objid ("b8ad5d68-3df9-4a6d-8d0e-f36c941b2e10")
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
    @objid ("ecae9ee1-6d48-4769-8c71-9ce6efca849f")
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
    @objid ("aea56bc8-027f-48d9-badd-7cd50d9165c7")
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
    @objid ("ca191cce-5a50-4d08-8db7-1e71d948d623")
    public void addCompositeSecurityInstances(final CompositeSecurityMetric obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0cafa63a-2709-431b-aeac-111258a21998")
    public void addDiagrams(final SecurityModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("24e7edb3-edd6-460a-bec1-3ffd96d44df0")
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
    @objid ("e6e166c8-705c-46f0-b973-a9119a8fa279")
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
    @objid ("60b5ab7e-95b2-48d5-bc70-090694994c76")
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
    @objid ("cd4edf19-ed08-470b-b314-713d7ec0d6d0")
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
    @objid ("b3f5a9c5-93c1-46f9-acf3-6a448e44ebcb")
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
    @objid ("c53766a1-b32e-4d4e-8b9b-97cb92a4a0a2")
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
    @objid ("ea7b1261-cdfa-4a0d-adc5-f5f5b6c9fd1d")
    public void addSecuritySLOs(final SecuritySLO obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("94a1bedc-b41f-4ac5-8b48-3673ed550445")
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
    @objid ("2664b680-285e-44d9-baba-495099bd28de")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'compositeSecurityInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("661deaa0-ef12-4b67-a209-8f997775c31f")
    public List<CompositeSecurityMetric> getCompositeSecurityInstances() {
        List<CompositeSecurityMetric> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (CompositeSecurityMetric.canInstantiate(mObj))
        			results.add((CompositeSecurityMetric)CamelDesignerProxyFactory.instantiate(mObj, CompositeSecurityMetric.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ea4af14c-a51c-4bce-9367-1aaea2e8746f")
    public List<SecurityModelDiagram> getDiagrams() {
        List<SecurityModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (SecurityModelDiagram.canInstantiate(mObj))
        			results.add((SecurityModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, SecurityModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("26701eb2-5f8f-47c8-a441-fc530e5859b6")
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
    @objid ("47f8bb43-4b7d-48e5-8972-f766b722b9a8")
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
    @objid ("e58a0380-261d-4320-802b-5becdc47aed7")
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
    @objid ("f020d2fa-25cc-4fd0-ab24-a110dddbdcfd")
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
    @objid ("83aa3fd2-04f6-41fd-a22c-93ce6c1a482e")
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
    @objid ("04d888cc-1e18-44f9-a0d8-b1f8e70b21e8")
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
    @objid ("9cc39824-83d4-4e7e-8ca9-9987e8e7479e")
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
    @objid ("63361590-4508-45c6-9f91-b0c2b18a09a8")
    public List<SecuritySLO> getSecuritySLOs() {
        List<SecuritySLO> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecuritySLO.canInstantiate(mObj))
        			results.add((SecuritySLO)CamelDesignerProxyFactory.instantiate(mObj, SecuritySLO.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("36a5dcbd-5d38-4e8f-af77-00f02a0fc6db")
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
    @objid ("a17b8314-357e-4efe-a8b7-057293f61196")
    public boolean removeCompositeSecurityInstances(final CompositeSecurityMetric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b46cb9ab-f560-4cc9-b544-9f20c9b246c4")
    public boolean removeDiagrams(final SecurityModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d17d04bb-b0af-4965-a4fa-74346e0dbaa1")
    public boolean removeRawSecurityMetrics(final RawSecurityMetric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityAttributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e427d3fd-222b-472f-8d6a-928bc29932be")
    public boolean removeSecurityAttributes(final SecurityAttribute obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ffa641f1-b144-495a-8ee6-265e6d605b7c")
    public boolean removeSecurityControls(final SecurityControl obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityDomains' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1bfdcb26-2a4c-47d9-9288-4841181d36b4")
    public boolean removeSecurityDomains(final SecurityDomain obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d72ded08-6922-44b5-8c5b-f9a96c1294eb")
    public boolean removeSecurityMetricInstances(final SecurityMetricInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityRequirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b698f439-4d49-45d6-aaaf-d73fdc3abc36")
    public boolean removeSecurityRequirements(final SecurityRequirement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securitySLOs' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6fcf963f-2650-4218-aa45-9f22c3fc65e9")
    public boolean removeSecuritySLOs(final SecuritySLO obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ccfe30b5-2dff-4fc5-b2b2-65574056b2d3")
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

    @objid ("882fa3ef-d4a4-4d0b-95ec-fc1af98d275f")
    protected SecurityModel(final Package elt) {
        super(elt);
    }

    @objid ("2405f496-8209-4c75-b1e1-0df64f112617")
    public static final class MdaTypes {
        @objid ("88baa679-06ca-485e-9406-18b0b3d388ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cdbc3a1f-f636-494a-82c1-42db9cfadacc")
        private static Stereotype MDAASSOCDEP;

        @objid ("a4f21f20-86de-43ba-9e3d-00ec3a3202c2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c687caaa-1a12-4f89-9c47-1cd2cb60d111")
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
