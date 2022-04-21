/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
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
    @objid ("25b87e2c-03ff-4c76-acf2-7a2a931c8a15")
    public static final String STEREOTYPE_NAME = "SecurityModel";

    /**
     * Tells whether a {@link SecurityModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << SecurityModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("508a794a-7130-4486-90ca-ca9d6fba1da0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << SecurityModel >> then instantiate a {@link SecurityModel} proxy.
     * 
     * @return a {@link SecurityModel} proxy on the created {@link Package}.
     */
    @objid ("f430ba8a-c6ad-41d6-bf66-6750ee76d178")
    public static SecurityModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityModel.STEREOTYPE_NAME);
        return SecurityModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link SecurityModel} proxy from a {@link Package} stereotyped << SecurityModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link SecurityModel} proxy or <i>null</i>.
     */
    @objid ("b8fb0fa1-8bb2-49f7-9379-aa17bc6b6c89")
    public static SecurityModel instantiate(final Package obj) {
        return SecurityModel.canInstantiate(obj) ? new SecurityModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityModel} proxy from a {@link Package} stereotyped << SecurityModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link SecurityModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d082d1ba-75cd-4691-bb28-ccbdf0e8c35e")
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
     */
    @objid ("8b9a1d1b-7761-4d7e-add6-8a2d8b31274a")
    public void addCompositeSecurityInstances(final CompositeSecurityMetric obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     */
    @objid ("ed87b55d-de99-4a10-a4ef-c4fba1664be7")
    public void addRawSecurityMetrics(final RawSecurityMetric obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityAttributes' role.<p>
     * Role description:
     * null
     */
    @objid ("b360c5b8-dde8-45b2-931a-7ffa86185bd4")
    public void addSecurityAttributes(final SecurityAttribute obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityControls' role.<p>
     * Role description:
     * null
     */
    @objid ("9766a027-74ae-4de8-bf0d-ed79b4ed8478")
    public void addSecurityControls(final SecurityControl obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityDomains' role.<p>
     * Role description:
     * null
     */
    @objid ("f0a5763d-cb67-4ec8-9932-745770c5ba25")
    public void addSecurityDomains(final SecurityDomain obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityMetricInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("e5fe75b3-f7a0-4859-8e0b-12fd33c05caa")
    public void addSecurityMetricInstances(final SecurityMetricInstance obj) {
        if (obj!=null)
          ((Package) this.elt).getDeclared().add(obj.getElement());
    }

    /**
     * Add a value to the 'securityRequirements' role.<p>
     * Role description:
     * null
     */
    @objid ("fa44f35d-ef13-4970-b174-6d10c5b67b93")
    public void addSecurityRequirements(final SecurityRequirement obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'securitySLOs' role.<p>
     * Role description:
     * null
     */
    @objid ("fb5cd900-c93f-4694-bcfa-89b28952a59a")
    public void addSecuritySLOs(final SecuritySLO obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("fb515abc-4f5e-40ce-85d5-503e7bd6fe3f")
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
     */
    @objid ("67809fb9-ddeb-4617-8797-c0f014d25b25")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'compositeSecurityInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("fe517735-bbb3-475d-8b41-beb24b53599e")
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
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("e298fc77-6242-4642-b8f0-4a59d494f022")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     */
    @objid ("9d99a2f4-ebfc-40c4-9c83-f12fd70dfaab")
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
     */
    @objid ("971034ac-9a67-4278-8d94-b5cbb3dcf84e")
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
     */
    @objid ("1fd97841-1f2e-4f70-a916-3ea4ea65490e")
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
     */
    @objid ("af72f8c6-aee6-4fbd-b941-ba6d3d076c59")
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
     */
    @objid ("6ad88aad-7257-42a2-895d-985f77c396aa")
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
     */
    @objid ("e6875c27-beb6-4328-a1ea-91ad7a286993")
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
     */
    @objid ("65156e96-4944-425a-a82c-35046d7c7e33")
    public List<SecuritySLO> getSecuritySLOs() {
        List<SecuritySLO> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (SecuritySLO.canInstantiate(mObj))
                    results.add((SecuritySLO)CamelDesignerProxyFactory.instantiate(mObj, SecuritySLO.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    @objid ("c634836f-fb59-4406-8c10-2b58fdfd9da6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'compositeSecurityInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("240db7d9-eb6a-41e8-9962-baef1eb2f5c5")
    public boolean removeCompositeSecurityInstances(final CompositeSecurityMetric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     */
    @objid ("054cda32-59a1-460b-be6c-443de3bd1dff")
    public boolean removeRawSecurityMetrics(final RawSecurityMetric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityAttributes' role.<p>
     * Role description:
     * null
     */
    @objid ("da421485-03d7-4a77-9eb2-e9423decb4bf")
    public boolean removeSecurityAttributes(final SecurityAttribute obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityControls' role.<p>
     * Role description:
     * null
     */
    @objid ("7902d0ff-8e56-485c-ae36-0b278e59c1b5")
    public boolean removeSecurityControls(final SecurityControl obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityDomains' role.<p>
     * Role description:
     * null
     */
    @objid ("a5facb49-bbd1-4ed4-9a88-5df03f30ea30")
    public boolean removeSecurityDomains(final SecurityDomain obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityMetricInstances' role.<p>
     * Role description:
     * null
     */
    @objid ("503ad549-59c3-4b78-9f97-a4285e96e6dc")
    public boolean removeSecurityMetricInstances(final SecurityMetricInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityRequirements' role.<p>
     * Role description:
     * null
     */
    @objid ("0cf87855-7384-4c87-bbc2-b7e0701f63ad")
    public boolean removeSecurityRequirements(final SecurityRequirement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securitySLOs' role.<p>
     * Role description:
     * null
     */
    @objid ("9a8b64cd-3569-473b-8771-a68f6dc20f5f")
    public boolean removeSecuritySLOs(final SecuritySLO obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("367febed-3ce4-4398-a10b-1c791ca14558")
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

    @objid ("11fd141d-49d4-4d34-8e88-15ced1f55a1e")
    protected SecurityModel(final Package elt) {
        super(elt);
    }

    @objid ("2405f496-8209-4c75-b1e1-0df64f112617")
    public static final class MdaTypes {
        @objid ("5e02bd0a-ff45-4a70-b21b-2c4c2a65baeb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c7036e2f-a5c2-4526-b3fb-c4c804c65529")
        private static Stereotype MDAASSOCDEP;

        @objid ("e0009524-c4cb-42bd-b6a5-57276571ec17")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("18b4ead0-9ffa-4bb9-bb27-aa5afa4b43da")
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
