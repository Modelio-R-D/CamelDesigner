/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << SecurityControl >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d61a388a-d45a-42f2-ba0d-ab77ccfcec55")
public class SecurityControl extends FeatureClass {
<<<<<<< HEAD
    @objid ("e3c0eff8-a0f8-43f7-a3fa-a98ce8e5d069")
    public static final String STEREOTYPE_NAME = "SecurityControl";

    @objid ("d243420f-b197-4e4c-9b5f-8ffa2af44154")
    public static final String ID_TAGTYPE = "id";

    @objid ("5e7943f7-fdf7-4954-a4c2-c04ce4bd628c")
=======
    @objid ("422ea53b-f74e-42e4-a19d-187622058cf7")
    public static final String STEREOTYPE_NAME = "SecurityControl";

    @objid ("12b340e4-2ab1-4b5d-9db9-263bc791924e")
    public static final String ID_TAGTYPE = "id";

    @objid ("acc43cf8-c4f4-4eba-9abd-0c8203e35f55")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String SPECIFICATION_TAGTYPE = "specification";

    /**
     * Tells whether a {@link SecurityControl proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << SecurityControl >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("12635af6-97e2-450c-93d6-320535b4aa24")
=======
    @objid ("97f0982c-c145-4060-a882-94057d737cdc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityControl.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << SecurityControl >> then instantiate a {@link SecurityControl} proxy.
     * 
     * @return a {@link SecurityControl} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("6aa47d2b-c889-4703-ab0c-72a33b11683c")
=======
    @objid ("2ba4d9cc-7340-4a49-aa93-db87f6ac0ca8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityControl create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityControl.STEREOTYPE_NAME);
        return SecurityControl.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link SecurityControl} proxy from a {@link Class} stereotyped << SecurityControl >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link SecurityControl} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("0af8139e-4b3c-4c70-bdb8-59ff643b26d8")
=======
    @objid ("a83dd0e8-f46c-469e-af29-cf0b2fdb742c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityControl instantiate(final Class obj) {
        return SecurityControl.canInstantiate(obj) ? new SecurityControl(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityControl} proxy from a {@link Class} stereotyped << SecurityControl >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link SecurityControl} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("b40c321d-d725-4646-b0d6-5814fa5ed77d")
=======
    @objid ("9bf9a199-64db-4a53-a19b-0ef31e5e6bcd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static SecurityControl safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (SecurityControl.canInstantiate(obj))
        	return new SecurityControl(obj);
        else
        	throw new IllegalArgumentException("SecurityControl: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'compositeSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9eb5afd6-dcc4-4c94-a1fe-d859bf6b0975")
=======
    @objid ("2abb3ec7-cdd4-4819-ab66-973717e9a088")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addCompositeSecurityMetrics(final CompositeSecurityMetric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
            d.setName("compositeSecurityMetrics");
            d.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "compositeSecurityMetrics");
        }
    }

    /**
     * Add a value to the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ac4ecf45-8fc1-4bfd-badf-59888018cc80")
=======
    @objid ("49dfaa72-5d92-45ff-a190-09a05ec778f0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addRawSecurityMetrics(final RawSecurityMetric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
            d.setName("rawSecurityMetrics");
            d.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "rawSecurityMetrics");
        }
    }

    /**
     * Add a value to the 'securityProperties' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("325bd1db-4292-410c-bb81-97c4b89f54f9")
=======
    @objid ("ffe8506e-54ab-431a-b196-33581e781702")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSecurityProperties(final SecurityAttribute obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
            d.setName("securityProperties");
            d.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "securityProperties");
        }
    }

<<<<<<< HEAD
    @objid ("1e33e2ac-b024-4146-8fff-c9dceb6b0187")
=======
    @objid ("8a8e7ae6-688a-4403-aa20-777ee023f375")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
        SecurityControl other = (SecurityControl) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'compositeSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9caf85bb-1a22-4d74-84a3-0154cd1c34d4")
=======
    @objid ("9335a621-0a2b-49a2-b104-d6776cf623f7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<CompositeSecurityMetric> getCompositeSecurityMetrics() {
        List<CompositeSecurityMetric> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "compositeSecurityMetrics")){
              if (CompositeSecurityMetric.canInstantiate(d.getDependsOn()))
                results.add((CompositeSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9016336b-2ccd-43e6-9b6d-7bfdaf24a32d")
=======
    @objid ("d436b79c-e379-4afd-a152-7ca76d3a4937")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public SecurityDomain getDomain() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "domain")){
                  if (SecurityDomain.canInstantiate(d.getDependsOn()))
                     return (SecurityDomain)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityDomain.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("84df6d90-8b5b-4299-aef3-21b9045ece52")
=======
    @objid ("e708cf01-b23c-47f8-981b-9351226aee43")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("92acd26d-d6a4-4906-be0f-5439ffc08637")
=======
    @objid ("77e7f2bc-a923-4d6b-80ce-d24043d196c2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getId() {
        return this.elt.getTagValue(SecurityControl.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ef997be9-c972-4ba9-9dd1-66b1a9c5fa8d")
=======
    @objid ("be2f2510-5701-46f8-9436-1ae7bc5340e4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<RawSecurityMetric> getRawSecurityMetrics() {
        List<RawSecurityMetric> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "rawSecurityMetrics")){
              if (RawSecurityMetric.canInstantiate(d.getDependsOn()))
                results.add((RawSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'securityProperties' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ce70faef-e9eb-4afc-b43a-77ae2bc52385")
=======
    @objid ("4b65999a-c616-4635-acd0-90bbe8444c53")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<SecurityAttribute> getSecurityProperties() {
        List<SecurityAttribute> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "securityProperties")){
              if (Certifiable.canInstantiate(d.getDependsOn()))
                results.add((Certifiable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Certifiable.MdaTypes.STEREOTYPE_ELT.getName()));
              if (SecurityAttribute.canInstantiate(d.getDependsOn()))
                results.add((SecurityAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityAttribute.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'specification'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("f1cd5c52-5084-4d11-b2de-68acac1b71fc")
=======
    @objid ("ed2a4783-db0d-46e2-b602-6f8ba600e915")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getSpecification() {
        return this.elt.getTagValue(SecurityControl.MdaTypes.SPECIFICATION_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'subDomain' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8a7b63c0-5857-4a2b-97aa-7887fb520969")
=======
    @objid ("017a72c1-673a-4b20-9c19-48c10404353a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public SecurityDomain getSubDomain() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "subDomain")){
                  if (SecurityDomain.canInstantiate(d.getDependsOn()))
                     return (SecurityDomain)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityDomain.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

<<<<<<< HEAD
    @objid ("69ff17c8-eb63-4932-985a-0675304ad9db")
=======
    @objid ("a273bcec-ef78-4161-8455-2806552766f1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'compositeSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("afb7d1ad-5c6a-4a86-adaf-6e8083d66368")
=======
    @objid ("bb5db85a-eb34-4981-a4f0-41f4d1de48f6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeCompositeSecurityMetrics(final CompositeSecurityMetric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "compositeSecurityMetrics")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'rawSecurityMetrics' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ad1b0e25-09f6-42d3-a966-1decd1d7bf7a")
=======
    @objid ("c884d532-f1c0-40f5-9733-81c15fefbf7b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRawSecurityMetrics(final RawSecurityMetric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "rawSecurityMetrics")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'securityProperties' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d02549aa-80fa-4f4d-b900-d2b1c5f8f70a")
=======
    @objid ("394afdb5-89e0-4e84-b5f9-03d83aba154f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSecurityProperties(final SecurityAttribute obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "securityProperties")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'domain' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("abbc1742-8509-4e91-9594-5411299dc7ed")
=======
    @objid ("540de5c9-7ed0-4a5f-8886-e86bf2569aec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setDomain(final SecurityDomain obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "domain")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
              dep.setName("domain");      dep.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "domain");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("acc25427-0645-4bde-9528-5bd69ddfc6f8")
=======
    @objid ("fa6cab3c-8746-4531-ab00-5e550de39e3a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setId(final String value) {
        this.elt.putTagValue(SecurityControl.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'specification'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("d7fe5d67-c94b-4663-8895-fab3c1d7de3f")
=======
    @objid ("ba0143f6-7b19-47fc-9006-0c1b02f01c4b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setSpecification(final String value) {
        this.elt.putTagValue(SecurityControl.MdaTypes.SPECIFICATION_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'subDomain' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("6c90c0ee-fd7c-4951-b22d-0871ee39e1d3")
=======
    @objid ("590fe4ca-61ee-4318-9b55-60ff3233f064")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setSubDomain(final SecurityDomain obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(SecurityControl.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE), "subDomain")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), SecurityControl.MdaTypes.MDAASSOCDEP);
              dep.setName("subDomain");      dep.putTagValue(SecurityControl.MdaTypes.MDAASSOCDEP_ROLE, "subDomain");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("4281a4b4-f2ee-4fb6-b82e-fc1791f02ec5")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("bf289535-e6f2-41fe-ba16-e8ac32fdd0c2")
=======
    @objid ("48fe84c1-b703-4897-afd7-8b54c41adf97")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected SecurityControl(final Class elt) {
        super(elt);
    }

    @objid ("38164d2f-917e-4f65-a67d-254038d33f9e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("63ecc6b9-8cf4-4260-8c0e-c9e26ba3785f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("723cddd9-4adb-441e-9932-c1a1199e3fc0")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("48815e8b-5245-47e7-b652-5cd72f464672")
        public static TagType SPECIFICATION_TAGTYPE_ELT;

        @objid ("7042db62-6752-4466-bb8e-55d9f47aed9c")
        private static Stereotype MDAASSOCDEP;

        @objid ("a77282e6-9c2c-44c1-a9e6-d87616b84ba9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31b25586-bd4f-48de-9140-e8580e416189")
=======
        @objid ("29d44f2d-5340-47b9-a0b2-0b0a7c92b6fe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("217d0bc6-3165-4c7f-b150-7e728e8a3f5c")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("adf63818-c44c-4b66-ac07-02d7aeb19b55")
        public static TagType SPECIFICATION_TAGTYPE_ELT;

        @objid ("7b27b1f8-955d-4cd2-9934-76ef0d6c0e6b")
        private static Stereotype MDAASSOCDEP;

        @objid ("91314829-3a1f-445c-9b6a-852e02c886b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("428d1f54-c768-496c-a5d3-ab585586fae9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0cf7fb23-2fb5-4c33-8d52-c3db4e05bb34");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d0865d90-2ead-4a1b-825d-1611f8206fcb");
            SPECIFICATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2caf403e-3e13-413c-9bb9-2e53d9d92f78");
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
