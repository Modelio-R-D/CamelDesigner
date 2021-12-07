/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << MmsConceptInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("28cc79c1-8e23-4dd7-b100-83242c265aac")
public class MmsConceptInstance extends MmsObject {
    @objid ("31d1c011-febc-4c48-b7bf-3a18d3e46f7c")
    public static final String STEREOTYPE_NAME = "MmsConceptInstance";

    /**
     * Tells whether a {@link MmsConceptInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MmsConceptInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d7eefab2-fb4c-42de-804d-508ba5e514cb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MmsConceptInstance >> then instantiate a {@link MmsConceptInstance} proxy.
     * 
     * @return a {@link MmsConceptInstance} proxy on the created {@link Instance}.
     */
    @objid ("e6830021-5c9d-4bec-b252-5ca3bb9bf903")
    public static MmsConceptInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME);
        return MmsConceptInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MmsConceptInstance} proxy from a {@link Instance} stereotyped << MmsConceptInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link MmsConceptInstance} proxy or <i>null</i>.
     */
    @objid ("e91ba592-84ff-40ac-b172-5f1b23d49733")
    public static MmsConceptInstance instantiate(final Instance obj) {
        return MmsConceptInstance.canInstantiate(obj) ? new MmsConceptInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsConceptInstance} proxy from a {@link Instance} stereotyped << MmsConceptInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link MmsConceptInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5e748f7b-9e69-42c3-a60b-73b7ef8471a2")
    public static MmsConceptInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MmsConceptInstance.canInstantiate(obj))
            return new MmsConceptInstance(obj);
        else
            throw new IllegalArgumentException("MmsConceptInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'propertyInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("dac73b92-d6ca-4154-a0d6-3196f7244296")
    public void addPropertyInstance(final MmsPropertyInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MmsConceptInstance.MdaTypes.MDAASSOCDEP);
            d.setName("propertyInstance");
            d.putTagValue(MmsConceptInstance.MdaTypes.MDAASSOCDEP_ROLE, "propertyInstance");
        }
    }

    @objid ("e181a55f-8b33-4816-bf0f-94455d14d2a0")
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
        MmsConceptInstance other = (MmsConceptInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}.
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("b7c3f286-812e-4af4-b17d-f6bee8751b32")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'propertyInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("21fa44ea-83f7-41a5-8faf-c431832f52ac")
    public List<MmsPropertyInstance> getPropertyInstance() {
        List<MmsPropertyInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MmsConceptInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsConceptInstance.MdaTypes.MDAASSOCDEP_ROLE), "propertyInstance")
              && MmsPropertyInstance.canInstantiate(d.getDependsOn()))
                results.add((MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsPropertyInstance.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7ab0095b-b8f4-4519-b9ae-98e349108ddd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'propertyInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("186ae839-95cc-4c80-90b5-b87b44cce189")
    public boolean removePropertyInstance(final MmsPropertyInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MmsConceptInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsConceptInstance.MdaTypes.MDAASSOCDEP_ROLE), "conceptInstance")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("8bc00316-2e58-418f-a1a9-29c23d09146e")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("b46bd84f-a532-4326-adc1-b816ba8fa5e4")
    protected MmsConceptInstance(final Instance elt) {
        super(elt);
    }

    @objid ("862d75e0-5992-4012-8c83-7a0ec8b66ab5")
    public static final class MdaTypes {
        @objid ("bc313bf8-341f-4283-b0c0-c4f7634070c2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8904de9d-2223-44de-81f0-871fd9a3c2dc")
        private static Stereotype MDAASSOCDEP;

        @objid ("cc610c3d-085c-410f-a64e-675a8f69f18f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0937d6a5-8eaf-47fa-972c-53ad235e5ba3")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "81bc1a2f-1255-41fb-b517-5ca503ccc73e");
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
