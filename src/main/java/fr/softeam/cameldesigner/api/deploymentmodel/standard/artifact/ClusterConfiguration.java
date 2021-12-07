/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
@objid ("63aa1a3f-c5f3-4c42-becc-dcda24f024a0")
public class ClusterConfiguration extends Configuration {
    @objid ("484cbc78-820b-4442-9988-a1ce50b273ca")
    public static final String STEREOTYPE_NAME = "ClusterConfiguration";

    @objid ("91143c16-2376-4ea0-ac26-af0180ad45a8")
    public static final String DOWNLOADURL_TAGTYPE = "downloadURL";

    /**
     * Tells whether a {@link ClusterConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ClusterConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("40f57ad4-caf4-45f9-bc94-afa5e6096a76")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ClusterConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ClusterConfiguration >> then instantiate a {@link ClusterConfiguration} proxy.
     * 
     * @return a {@link ClusterConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("9d86139b-5588-48eb-91e8-7a4ae2e263ac")
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
    @objid ("2ecf475a-d191-4dae-b286-31bf0eee6b95")
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
    @objid ("2ee6c026-bf5e-4825-ab2c-71abf57719c2")
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
    @objid ("c33a37dd-1d87-4f38-bbc5-f564766eb7a9")
    public void addConfigParameters(final AttributeAttribute obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ClusterConfiguration.MdaTypes.MDAASSOCDEP);
            d.setName("configParameters");
            d.putTagValue(ClusterConfiguration.MdaTypes.MDAASSOCDEP_ROLE, "configParameters");
        }
    }

    @objid ("35b47d2e-231a-4398-9da0-0c154b7ccb61")
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
    @objid ("fe0281d7-2c73-4bd5-8577-633e01770c23")
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
    @objid ("f5c655ac-f1ed-49c7-b93f-47137b9c2fc0")
    public String getDownloadURL() {
        return this.elt.getTagValue(ClusterConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}.
     * 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("02487d66-a74f-4701-b852-ab8705b99ecd")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    @objid ("72a11b75-9ed2-49bc-bcf0-2ec69a1e4720")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'configParameters' role.<p>
     * Role description:
     * null
     */
    @objid ("9fad07bd-0b04-44c7-90b0-f6a2c6fce8d7")
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
    @objid ("b042bd2c-0fa3-4a7b-964e-f8df4e86112e")
    public void setDownloadURL(final String value) {
        this.elt.putTagValue(ClusterConfiguration.MdaTypes.DOWNLOADURL_TAGTYPE_ELT, value);
    }

    @objid ("155a3d35-1151-4855-8c12-62b19ad92953")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("99cc7142-eecb-429f-bfa5-0bf6d639d236")
    protected ClusterConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("6a9ae6c0-8629-45e2-ab3b-cb4a2ca54edb")
    public static final class MdaTypes {
        @objid ("0828cab1-ab87-45f7-8dbd-3f6039e71fe9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dc528df4-cb96-4f33-aedc-714cb40b9778")
        public static TagType DOWNLOADURL_TAGTYPE_ELT;

        @objid ("4b4c8710-debe-4635-ba28-3a0596b353b3")
        private static Stereotype MDAASSOCDEP;

        @objid ("2e972b53-8888-485b-982f-a28e79e51ed1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c9b7e567-6190-4e7a-bace-7923eeeae0c7")
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
