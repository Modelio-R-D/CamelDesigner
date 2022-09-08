/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
 * Proxy class to handle a {@link Class} with << CloudProvider >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fb9d9a88-d4a0-4e3f-a3de-0a99ce0662d5")
public class CloudProvider extends Organisation {
    @objid ("ac69c5e6-a776-44b8-a297-6dff6a69f33a")
    public static final String STEREOTYPE_NAME = "CloudProvider";

    @objid ("4e43aa49-745f-4c74-b316-b9b122c17442")
    public static final String IAAS_TAGTYPE = "IaaS";

    @objid ("06dc7973-79fe-4971-8edf-0e4363fb87d8")
    public static final String PAAS_TAGTYPE = "PaaS";

    @objid ("2ab4e74c-88f7-4e4c-96a5-c0785c943cc1")
    public static final String SAAS_TAGTYPE = "SaaS";

    @objid ("2820943e-7813-4546-ac2e-9a94a43e48dd")
    public static final String PUBLIC_TAGTYPE = "public";

    /**
     * Tells whether a {@link CloudProvider proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudProvider >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("865da68a-5d13-47e7-a245-33e6a7662afa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudProvider >> then instantiate a {@link CloudProvider} proxy.
     * 
     * @return a {@link CloudProvider} proxy on the created {@link Class}.
     */
    @objid ("4c76cf5e-c78a-4ea0-8283-61d7127e1bc1")
    public static CloudProvider create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME);
        return CloudProvider.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link CloudProvider} proxy or <i>null</i>.
     */
    @objid ("75bede71-2d59-431d-8118-dbf62f2efe6f")
    public static CloudProvider instantiate(final Class obj) {
        return CloudProvider.canInstantiate(obj) ? new CloudProvider(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link CloudProvider} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("158fa974-7679-4642-a13d-31b4200636e9")
    public static CloudProvider safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudProvider.canInstantiate(obj))
            return new CloudProvider(obj);
        else
            throw new IllegalArgumentException("CloudProvider: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4d1756a3-5531-4784-b0c0-753905d3dfa8")
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
        CloudProvider other = (CloudProvider) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("7ad1bb0b-0d86-4dc9-b7b8-969dbb7abcad")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("6a48928f-797d-47dd-984b-6ac2a2bd86d7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("73e7f941-960d-418d-913d-e7f2a0adab1b")
    public boolean isIaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("33952adb-6aa2-4c6b-a9c1-279058f01956")
    public boolean isPaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("10072de2-6129-4c45-904c-db910c3f4c24")
    public boolean isPublic() {
        return this.elt.isTagged(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("448eb06b-dd58-4fe1-984e-127abd31c3a9")
    public boolean isSaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c29dad48-ffda-4ada-ba4f-8fb461cd8bff")
    public void setIaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("94515b4d-556b-4e4e-9db4-c3be54215b25")
    public void setPaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e12c1046-36ed-44ba-be79-f45bef7939a9")
    public void setPublic(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f1048393-fb9c-4832-a04e-1359634619f2")
    public void setSaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    @objid ("88addc4b-73d6-4a23-8191-8ea1c4a030ce")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("985e4e3d-7b8c-4196-a9a0-2f5223bc4d52")
    protected CloudProvider(final Class elt) {
        super(elt);
    }

    @objid ("3a9e1b7d-4edb-4361-aa5d-657d494731fb")
    public static final class MdaTypes {
        @objid ("e5e9b8c4-17f7-4119-ad62-63abae6e51c3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("587dda1e-2956-41e0-b522-9c862bd60dc2")
        public static TagType PUBLIC_TAGTYPE_ELT;

        @objid ("118fd86f-63ec-4784-905e-69156f8d2120")
        public static TagType SAAS_TAGTYPE_ELT;

        @objid ("c55f1929-1481-4250-9303-c1ba2a3a3ded")
        public static TagType PAAS_TAGTYPE_ELT;

        @objid ("a72a8076-1cfe-4f59-b1ed-cb0816208299")
        public static TagType IAAS_TAGTYPE_ELT;

        @objid ("f94771a2-9451-47a9-9f8b-434d1c1ae408")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f893271-b724-4b76-b812-4f968548ec09")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b8ea892e-1f6d-46e3-9543-6ec31a606ae4")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eb3e5683-72bd-4e46-8bda-1ea07af0c09e");
            PUBLIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a7b7a414-a54a-45b1-a53e-3126883211b8");
            SAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f42c6540-bd96-497b-9689-075610b04eda");
            PAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d89c42d7-ad3d-49e1-a24d-46b82e7965ac");
            IAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e33192b2-ce6c-499c-98c5-167d63c32690");
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
