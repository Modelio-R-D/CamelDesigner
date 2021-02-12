/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
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
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << ClusterConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class ClusterConfiguration extends Configuration {
    public static final String STEREOTYPE_NAME = "ClusterConfiguration";

    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    /**
     * Tells whether a {@link ClusterConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ClusterConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ClusterConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ClusterConfiguration >> then instantiate a {@link ClusterConfiguration} proxy.
     * 
     * @return a {@link ClusterConfiguration} proxy on the created {@link Artifact}.
     */
    public static ClusterConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ClusterConfiguration.STEREOTYPE_NAME);
        return ClusterConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link ClusterConfiguration} proxy from a {@link Artifact} stereotyped << ClusterConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Artifact
     * @return a {@link ClusterConfiguration} proxy or <i>null</i>.
     */
    public static ClusterConfiguration instantiate(final Artifact obj) {
        return ClusterConfiguration.canInstantiate(obj) ? new ClusterConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClusterConfiguration} proxy from a {@link Artifact} stereotyped << ClusterConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Artifact}
     * @return a {@link ClusterConfiguration} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ClusterConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ClusterConfiguration.canInstantiate(obj))
            return new ClusterConfiguration(obj);
        else
            throw new IllegalArgumentException("ClusterConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'configParameters' role.<p>
     * Role description:
     * null
     */
    public void addConfigParameters(final AttributeAttribute obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ClusterConfiguration.MdaTypes.MDAASSOCDEP);
            d.setName("configParameters");
            d.putTagValue(ClusterConfiguration.MdaTypes.MDAASSOCDEP_ROLE, "configParameters");
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
        ClusterConfiguration other = (ClusterConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'configParameters' role.<p>
     * Role description:
     * null
     */
    public List<AttributeAttribute> getConfigParameters() {
        List<AttributeAttribute> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(ClusterConfiguration.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ClusterConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "configParameters")
              && AttributeAttribute.canInstantiate(d.getDependsOn()))
                results.add((AttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getDownloadURL() {
        return this.elt.getTagValue(ClusterConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}.
     * 
     * @return the Artifact represented by this proxy, never null.
     */
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'configParameters' role.<p>
     * Role description:
     * null
     */
    public boolean removeConfigParameters(final AttributeAttribute obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ClusterConfiguration.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ClusterConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'downloadURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setDownloadURL(final String value) {
        this.elt.putTagValue(ClusterConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT, value);
    }

    protected ClusterConfiguration(final Artifact elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b8d5ac50-75fd-4e01-9d50-04e6139e072c");
            DOWNLOADURL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "33966f3f-93c8-4e48-88fc-3e4ca226da16");
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
