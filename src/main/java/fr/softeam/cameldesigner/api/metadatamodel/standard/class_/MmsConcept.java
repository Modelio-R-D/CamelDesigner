/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
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
 * Proxy class to handle a {@link Class} with << MmsConcept >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("87827b52-a413-4f8b-ac16-cf56568d032b")
public class MmsConcept extends MmsObject {
    @objid ("3adc1728-bb69-4298-b38c-5622ee7e21b3")
    public static final String STEREOTYPE_NAME = "MmsConcept";

    /**
     * Tells whether a {@link MmsConcept proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MmsConcept >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("99401fe8-1026-4834-8cd3-81ba74e4f904")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConcept.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MmsConcept >> then instantiate a {@link MmsConcept} proxy.
     * 
     * @return a {@link MmsConcept} proxy on the created {@link Class}.
     */
    @objid ("f046b2d5-a131-46f2-9e4a-57d9400dd69f")
    public static MmsConcept create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsConcept.STEREOTYPE_NAME);
        return MmsConcept.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MmsConcept} proxy from a {@link Class} stereotyped << MmsConcept >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link MmsConcept} proxy or <i>null</i>.
     */
    @objid ("b2aeec64-d4cc-4094-a3ed-b4e81824c485")
    public static MmsConcept instantiate(final Class obj) {
        return MmsConcept.canInstantiate(obj) ? new MmsConcept(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsConcept} proxy from a {@link Class} stereotyped << MmsConcept >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link MmsConcept} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8416a7d6-a114-4d8e-9560-729e2d818407")
    public static MmsConcept safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MmsConcept.canInstantiate(obj))
            return new MmsConcept(obj);
        else
            throw new IllegalArgumentException("MmsConcept: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'concept' role.<p>
     * Role description:
     * null
     */
    @objid ("228e89d7-2b02-4817-a667-77c6c424c79d")
    public void addConcept(final MmsConcept obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, MmsConcept.MdaTypes.MDAASSOCDEP);
            d.setName("parent");
            d.putTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE, "parent");
        }
    }

    /**
     * Add a value to the 'instance' role.<p>
     * Role description:
     * null
     */
    @objid ("45ec7059-1493-4ae7-80ac-63328094885d")
    public void addInstance(final MmsConceptInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MmsConcept.MdaTypes.MDAASSOCDEP);
            d.setName("instance");
            d.putTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE, "instance");
        }
    }

    /**
     * Add a value to the 'property' role.<p>
     * Role description:
     * null
     */
    @objid ("558abc9f-39b0-4556-80fd-c794aa4a9bf4")
    public void addProperty(final MmsProperty obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MmsConcept.MdaTypes.MDAASSOCDEP);
            d.setName("property");
            d.putTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE, "property");
        }
    }

    @objid ("f9481984-4dfa-4807-9bcf-1eac27f380a7")
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
        MmsConcept other = (MmsConcept) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'concept' role.<p>
     * Role description:
     * null
     */
    @objid ("dd2512d8-24f1-4bcc-8d1e-a62c859a8b07")
    public List<MmsConcept> getConcept() {
        List<MmsConcept> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "parent")
              && MmsConcept.canInstantiate(d.getImpacted())) {
                 results.add((MmsConcept)CamelDesignerProxyFactory.instantiate(d.getImpacted(), MmsConcept.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8ad1ce5f-6547-4785-ae13-0c042e24a7a5")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'instance' role.<p>
     * Role description:
     * null
     */
    @objid ("a2bfa93f-3831-4d4a-ba61-a11a70dc6880")
    public List<MmsConceptInstance> getInstance() {
        List<MmsConceptInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "instance")
              && MmsConceptInstance.canInstantiate(d.getDependsOn()))
                results.add((MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("61fd0a2e-5b30-4aac-b604-bd282b862c37")
    public MmsConcept getParent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "parent")
                  && MmsConcept.canInstantiate(d.getDependsOn())) {
                     return (MmsConcept)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'property' role.<p>
     * Role description:
     * null
     */
    @objid ("bb13e084-dde6-497c-b6b0-62bd37eccc62")
    public List<MmsProperty> getProperty() {
        List<MmsProperty> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "property")
              && MmsProperty.canInstantiate(d.getDependsOn()))
                results.add((MmsProperty)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsProperty.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("67117c61-d213-48f2-bfa9-68934ad98dcc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'concept' role.<p>
     * Role description:
     * null
     */
    @objid ("2ab4eac3-ff5c-47a1-b62c-54d82d6418a2")
    public boolean removeConcept(final MmsConcept obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "parent"))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'instance' role.<p>
     * Role description:
     * null
     */
    @objid ("324bf384-314e-4154-8356-3758c369f9ca")
    public boolean removeInstance(final MmsConceptInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'property' role.<p>
     * Role description:
     * null
     */
    @objid ("56c63f93-1f72-4318-86bb-de3cd3c41cc1")
    public boolean removeProperty(final MmsProperty obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "domain")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     */
    @objid ("9e9ca9ab-05d6-4a88-9e5e-487297724935")
    public void setParent(final MmsConcept obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MmsConcept.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE), "parent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MmsConcept.MdaTypes.MDAASSOCDEP);
              dep.setName("parent");      dep.putTagValue(MmsConcept.MdaTypes.MDAASSOCDEP_ROLE, "parent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("9c89b34e-fdbd-4564-bb02-f67d59cc77ad")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("817d1f18-59ed-4cd7-93b9-a4609afd33e4")
    protected MmsConcept(final Class elt) {
        super(elt);
    }

    @objid ("acc006aa-96cd-4009-abc5-630b360acd1a")
    public static final class MdaTypes {
        @objid ("c315b089-4b9a-416e-a976-de3f618b289e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("26e100c8-01bd-4ec2-a778-49c00780a7b6")
        private static Stereotype MDAASSOCDEP;

        @objid ("7fcdb8a1-8382-4e56-a485-6df5248acd68")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bd08e32b-3b19-48e1-89fc-f350fd3a78a0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "6f3091ee-3a3b-4157-8b89-872f99b970f9");
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
