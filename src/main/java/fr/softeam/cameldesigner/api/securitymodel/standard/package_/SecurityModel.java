/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("4a5e0087-110a-4f82-8311-38cab65daa71")
    public static final String STEREOTYPE_NAME = "SecurityModel";

    /**
     * Tells whether a {@link SecurityModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << SecurityModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b96e6562-4614-4648-b36b-1c5c12bb30ae")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << SecurityModel >> then instantiate a {@link SecurityModel} proxy.
     * 
     * @return a {@link SecurityModel} proxy on the created {@link Package}.
     */
    @objid ("d391375d-4503-4264-beff-11c3b792fb23")
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
    @objid ("ed2f5826-0e84-48d6-8856-8ee40dc9b456")
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
    @objid ("a9763b47-8077-41f4-89e1-e07eca800f35")
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
    @objid ("33087481-c24d-4769-997b-209c697d655a")
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
    @objid ("4cd80e5d-84d9-48a8-852d-e76eb07165e5")
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
    @objid ("24c87281-0585-467f-8d38-9b390f2bd45d")
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
    @objid ("ab6ae6f4-1a74-4bff-8242-20d032c2202f")
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
    @objid ("a0bc07bd-4798-4a95-9300-9b01afdd898c")
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
    @objid ("13d49744-1700-494e-9a85-61cf1688e979")
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
    @objid ("11d0d3fa-b97d-4bfc-be57-5ceb46c85c39")
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
    @objid ("a97b1c56-eaa4-45c9-aa8e-b53198cd19d3")
    public void addSecuritySLOs(final SecuritySLO obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("9b68c149-6b8e-4222-942d-8a98f0f0e82a")
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
    @objid ("c515ac78-f47e-4cdd-85bf-553838223370")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'compositeSecurityInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3781c3a5-40de-42fd-a6c6-19e7f96826bc")
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
    @objid ("6390f086-c06a-427f-959b-de2585a90a18")
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
    @objid ("8c1104bc-9fc9-4059-b5f5-e74999dc7ceb")
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
    @objid ("458f421f-bd07-48d5-894e-4dbe51a50e4e")
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
    @objid ("3ba6eda1-2198-4bbe-a14d-5a2de5bb1b6f")
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
    @objid ("d45e2b9b-7ebd-4f4b-8211-7c49452d6985")
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
    @objid ("cb38f660-a250-430e-8ccc-e39fc30f2673")
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
    @objid ("bc22e516-c04e-4eb2-bf2e-c6cd2545e567")
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
    @objid ("460e8518-a7f0-40b4-8f78-fe5687f1c3bb")
    public List<SecuritySLO> getSecuritySLOs() {
        List<SecuritySLO> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (SecuritySLO.canInstantiate(mObj))
        			results.add((SecuritySLO)CamelDesignerProxyFactory.instantiate(mObj, SecuritySLO.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("ae127336-0702-4642-ae88-23d86000c91a")
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
    @objid ("a21bc94b-695a-4fa5-b0a7-79185726a835")
    public boolean removeCompositeSecurityInstances(final CompositeSecurityMetric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d8f10f07-d5c3-47c9-b0d2-7c11a6945aae")
    public boolean removeRawSecurityMetrics(final RawSecurityMetric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityAttributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("717d2032-4fcd-4102-b200-41dda85a561e")
    public boolean removeSecurityAttributes(final SecurityAttribute obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityControls' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3b97b2b5-b816-498c-8fc2-2e22a1aac65a")
    public boolean removeSecurityControls(final SecurityControl obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityDomains' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("92cf3f37-b0bf-48c4-945c-341030bda752")
    public boolean removeSecurityDomains(final SecurityDomain obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b76b27dc-2dbe-4cdc-b5f0-a1e7d3da967f")
    public boolean removeSecurityMetricInstances(final SecurityMetricInstance obj) {
        return (obj!=null)? ((Package) this.elt).getDeclared().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securityRequirements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a3eac3d9-53c0-42ee-9406-0e63c071e73c")
    public boolean removeSecurityRequirements(final SecurityRequirement obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'securitySLOs' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("afafa406-d36d-4c85-8a93-e00406fcc9ea")
    public boolean removeSecuritySLOs(final SecuritySLO obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("24f72910-ca8d-4544-86f0-114db6d83637")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("d6494135-6e9c-4ee4-a29e-8acb056b462c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("ce61e1cc-164d-43a3-9069-6463227da63e")
    protected SecurityModel(final Package elt) {
        super(elt);
    }

    @objid ("2405f496-8209-4c75-b1e1-0df64f112617")
    public static final class MdaTypes {
        @objid ("96f9a35d-450f-47af-847f-fffb3b64831c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e41cdd0a-1246-421b-8f47-50e585daf1bb")
        private static Stereotype MDAASSOCDEP;

        @objid ("07441984-4655-4309-9516-0a0974847880")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e0976a2-2f8a-4b93-9db2-12182ecbfe4e")
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
