/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
 * Proxy class to handle a {@link Class} with << ProviderRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("82acfd5d-6977-4081-8c3d-eddebe8238e8")
public class ProviderRequirement extends HardRequirement {
<<<<<<< HEAD
    @objid ("c335eed1-c3f1-4b6e-9226-25f506a0dfab")
    public static final String STEREOTYPE_NAME = "ProviderRequirement";

    @objid ("37ceca7c-9cdc-4f4c-bccc-01c23982dee6")
    public static final String CLOUDTYPE_TAGTYPE = "cloudType";

    @objid ("99e8da8b-fb97-48a4-9007-472f04b9f749")
=======
    @objid ("d110f5da-6535-4eb8-b119-7a2ec681c9b6")
    public static final String STEREOTYPE_NAME = "ProviderRequirement";

    @objid ("ef8f1c4d-9dd1-48ec-a213-c9fc7e2c148d")
    public static final String CLOUDTYPE_TAGTYPE = "cloudType";

    @objid ("53363fb1-df9c-4a11-aa8f-ff7508be741d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String PROVIDERNAMES_TAGTYPE = "providerNames";

    /**
     * Tells whether a {@link ProviderRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ProviderRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("1e492927-3ad7-42b6-bc2a-4b0ef6d60f24")
=======
    @objid ("1c9fd3b7-42e8-41f5-923c-aa2fa861e59b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ProviderRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ProviderRequirement >> then instantiate a {@link ProviderRequirement} proxy.
     * 
     * @return a {@link ProviderRequirement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("3fe7d5a5-77c9-4750-a904-2d63c5d03792")
=======
    @objid ("58e44ac3-b393-4157-94fa-63cf980082f8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ProviderRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ProviderRequirement.STEREOTYPE_NAME);
        return ProviderRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ProviderRequirement} proxy from a {@link Class} stereotyped << ProviderRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ProviderRequirement} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("d2680618-7b35-45dc-a3ab-e798922350e3")
=======
    @objid ("fa12f1a9-6a20-464f-b434-f3d6d107ea76")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ProviderRequirement instantiate(final Class obj) {
        return ProviderRequirement.canInstantiate(obj) ? new ProviderRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProviderRequirement} proxy from a {@link Class} stereotyped << ProviderRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ProviderRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("1eecf6d1-87c4-41e0-94d8-525ecafcb7c7")
=======
    @objid ("620c25c8-925a-47ff-96eb-df948f88706c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ProviderRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ProviderRequirement.canInstantiate(obj))
        	return new ProviderRequirement(obj);
        else
        	throw new IllegalArgumentException("ProviderRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("8621e615-b757-4eaf-9c12-8f157076ac25")
=======
    @objid ("7d610c8f-daeb-47b9-a876-9b1b4caadd95")
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
        ProviderRequirement other = (ProviderRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'cloudType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8685c9f4-359e-4d3d-a3a6-40d22ce8603d")
=======
    @objid ("e033c1b9-49fc-439d-b0da-5fb10426aee1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getCloudType() {
        return this.elt.getTagValue(ProviderRequirement.MdaTypes.CLOUDTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("7f38c289-6bdc-4f93-b7ff-332172476ad7")
=======
    @objid ("c33e8f1d-ddc0-4ab8-95b5-1629e9233179")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for List<String> property 'providerNames'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("4e3efcc9-f3b7-4578-996a-9a1d0e28b834")
=======
    @objid ("78d43561-bea4-4df7-9410-f0143a8974db")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<String> getProviderNames() {
        return this.elt.getTagValues(ProviderRequirement.MdaTypes.PROVIDERNAMES_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("08c29384-cdbb-401f-b8c0-5f7159f0724d")
=======
    @objid ("5fbe5036-9a99-46c7-8ee0-7d03e9cc7a4c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'cloudType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("9121ccbb-3d0e-4be7-adcc-9bd3c66abc06")
=======
    @objid ("c6d85368-60e4-4c94-bec7-5050448f476b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCloudType(final String value) {
        this.elt.putTagValue(ProviderRequirement.MdaTypes.CLOUDTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'providerNames'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b7596028-fbd8-4610-87b6-b570d06a794e")
=======
    @objid ("04a2dae6-a636-4eb3-9079-153927089201")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setProviderNames(final List<String> values) {
        this.elt.putTagValues(ProviderRequirement.MdaTypes.PROVIDERNAMES_TAGTYPE_ELT, values);
    }

    @objid ("0b36709e-372e-403e-a829-3592c465122a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("c43d5548-897d-4581-9e89-d466f78c6a50")
=======
    @objid ("6fedb0a0-1697-4f8d-9e5d-1baefff005a9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ProviderRequirement(final Class elt) {
        super(elt);
    }

    @objid ("562f3532-fd37-4432-a9ac-219453fb6332")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("89458966-3f95-404f-9b57-0be075ef73c2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("540b420d-a70c-4334-af02-fdaf85d77dcc")
        public static TagType PROVIDERNAMES_TAGTYPE_ELT;

        @objid ("49c4994e-0430-42f7-92d3-7f22ccfa723c")
        public static TagType CLOUDTYPE_TAGTYPE_ELT;

        @objid ("a859b5ee-bc55-445c-94d8-9db41432a30d")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8c94e84-f307-42a4-b3da-c8bf702c6f03")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eb4d0f41-5900-454c-9a7d-8d89db59b353")
=======
        @objid ("f707dd83-06cb-48c8-8353-427dfee5e60c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0e38aa2d-6e1e-4f78-ad54-d3e98b4f74fa")
        public static TagType PROVIDERNAMES_TAGTYPE_ELT;

        @objid ("aa5f2338-6e90-4106-89ef-46576e370aeb")
        public static TagType CLOUDTYPE_TAGTYPE_ELT;

        @objid ("43d2a65c-d92a-44da-99c9-ba07b6106814")
        private static Stereotype MDAASSOCDEP;

        @objid ("0c3906e4-7788-4423-97d1-848fb36772da")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("37bf10b4-da13-4bac-844d-90f6283ab26a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3889bd5f-decc-4b65-b4f4-e9f2db4b8446");
            PROVIDERNAMES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ba7ca0d-40ed-45d4-b49f-4c7abf286fd0");
            CLOUDTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4bc02bc5-50c2-4fee-9fcd-538e95fd8460");
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
