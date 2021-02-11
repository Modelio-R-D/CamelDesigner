/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
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
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AttributeLink} with << MmsPropertyInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class MmsPropertyInstance extends MmsObject {
    public static final String STEREOTYPE_NAME = "MmsPropertyInstance";

    public static final String PROPERTYVALUE_TAGTYPE = "propertyValue";

    /**
     * Tells whether a {@link MmsPropertyInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link AttributeLink} stereotyped << MmsPropertyInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AttributeLink) && ((AttributeLink) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AttributeLink} stereotyped << MmsPropertyInstance >> then instantiate a {@link MmsPropertyInstance} proxy.
     * 
     * @return a {@link MmsPropertyInstance} proxy on the created {@link AttributeLink}.
     */
    public static MmsPropertyInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AttributeLink");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MmsPropertyInstance.STEREOTYPE_NAME);
        return MmsPropertyInstance.instantiate((AttributeLink)e);
    }

    /**
     * Tries to instantiate a {@link MmsPropertyInstance} proxy from a {@link AttributeLink} stereotyped << MmsPropertyInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a AttributeLink
     * @return a {@link MmsPropertyInstance} proxy or <i>null</i>.
     */
    public static MmsPropertyInstance instantiate(final AttributeLink obj) {
        return MmsPropertyInstance.canInstantiate(obj) ? new MmsPropertyInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MmsPropertyInstance} proxy from a {@link AttributeLink} stereotyped << MmsPropertyInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link AttributeLink}
     * @return a {@link MmsPropertyInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MmsPropertyInstance safeInstantiate(final AttributeLink obj) throws IllegalArgumentException {
        if (MmsPropertyInstance.canInstantiate(obj))
            return new MmsPropertyInstance(obj);
        else
            throw new IllegalArgumentException("MmsPropertyInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MmsPropertyInstance other = (MmsPropertyInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    public MmsConceptInstance getConceptInstance() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(MmsPropertyInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MmsPropertyInstance.MdaTypes.MDAASSOCDEP_ROLE), "propertyInstance")
              && MmsConceptInstance.canInstantiate(d.getImpacted())) {
                  return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getImpacted(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    /**
     * Get the underlying {@link AttributeLink}.
     * 
     * @return the AttributeLink represented by this proxy, never null.
     */
    @Override
    public AttributeLink getElement() {
        return (AttributeLink)super.getElement();
    }

    /**
     * Getter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getPropertyValue() {
        return this.elt.getTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'conceptInstance' role.<p>
     * Role description:
     * null
     */
    public void setConceptInstance(final MmsConceptInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(MmsPropertyInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MmsPropertyInstance.MdaTypes.MDAASSOCDEP_ROLE), "propertyInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(obj.getElement(), this.elt, MmsPropertyInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("propertyInstance");
              dep.putTagValue(MmsPropertyInstance.MdaTypes.MDAASSOCDEP_ROLE, "propertyInstance");
          }
          dep.setImpacted(obj.getElement());
        }
    }

    /**
     * Setter for string property 'propertyValue'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setPropertyValue(final String value) {
        this.elt.putTagValue(MmsPropertyInstance.MdaTypes.PROPERTYVALUE_TAGTYPE_ELT, value);
    }

    protected MmsPropertyInstance(final AttributeLink elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType PROPERTYVALUE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f4953787-31fa-4eed-88df-83d5ad51d82e");
            PROPERTYVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1df65abe-3c98-4cde-9656-91b11230e762");
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
