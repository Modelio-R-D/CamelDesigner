/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
public class MmsConceptInstance extends MmsObject {
    public static final String STEREOTYPE_NAME = "MmsConceptInstance";

    /**
     * Tells whether a {@link MmsConceptInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MmsConceptInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsConceptInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MmsConceptInstance >> then instantiate a {@link MmsConceptInstance} proxy.
     * 
     * @return a {@link MmsConceptInstance} proxy on the created {@link Instance}.
     */
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
    public void addPropertyInstance(final MmsPropertyInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MmsConceptInstance.MdaTypes.MDAASSOCDEP);
            d.setName("propertyInstance");
            d.putTagValue(MmsConceptInstance.MdaTypes.MDAASSOCDEP_ROLE, "propertyInstance");
        }
    }

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
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'propertyInstance' role.<p>
     * Role description:
     * null
     */
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

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'propertyInstance' role.<p>
     * Role description:
     * null
     */
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

    protected MmsConceptInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
