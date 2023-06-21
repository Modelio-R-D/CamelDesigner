/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("42c70e09-ab18-4372-9d3d-6a3b6b5f22d4")
    public static final String STEREOTYPE_NAME = "ProviderRequirement";

    @objid ("57ce96c8-55db-4406-a2a6-1cc8b81aece7")
    public static final String CLOUDTYPE_TAGTYPE = "cloudType";

    @objid ("8ffd8a69-dc33-4285-9853-663a1de3db15")
    public static final String PROVIDERNAMES_TAGTYPE = "providerNames";

    /**
     * Tells whether a {@link ProviderRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ProviderRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("70dadec4-97d3-461e-b801-bc09c2c4283a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ProviderRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ProviderRequirement >> then instantiate a {@link ProviderRequirement} proxy.
     * 
     * @return a {@link ProviderRequirement} proxy on the created {@link Class}.
     */
    @objid ("265494d5-a20c-4bb4-8d51-d8b9ee9ef834")
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
    @objid ("5f19933d-397a-4efc-9a2d-d0e98254590b")
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
    @objid ("9d96b678-a85d-4a3c-91b3-0c20e5e0d900")
    public static ProviderRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ProviderRequirement.canInstantiate(obj))
        	return new ProviderRequirement(obj);
        else
        	throw new IllegalArgumentException("ProviderRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d2914f1d-b935-4f22-8a66-c1fe4b6def01")
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
    @objid ("fc3cf171-2b66-483d-a6ac-2dd7ccd2816d")
    public String getCloudType() {
        return this.elt.getTagValue(ProviderRequirement.MdaTypes.CLOUDTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9fd6f5fc-69c7-48ba-9b89-63a6a4aedcea")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for List<String> property 'providerNames'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    @objid ("d367a857-4e77-4264-879a-9923c98ee700")
    public List<String> getProviderNames() {
        return this.elt.getTagValues(ProviderRequirement.MdaTypes.PROVIDERNAMES_TAGTYPE_ELT);
    }

    @objid ("ae1bbdc0-ceb5-4290-bed9-d817f003f884")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'cloudType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c5327689-ba47-42fb-b720-04144e60df43")
    public void setCloudType(final String value) {
        this.elt.putTagValue(ProviderRequirement.MdaTypes.CLOUDTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'providerNames'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("10b3fed1-1364-47df-b901-894e0c44708d")
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

    @objid ("3075f01a-4674-4018-afbe-6d8f4a311345")
    protected ProviderRequirement(final Class elt) {
        super(elt);
    }

    @objid ("562f3532-fd37-4432-a9ac-219453fb6332")
    public static final class MdaTypes {
        @objid ("598cb388-2c21-468b-8691-43c510834573")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8d8e1e17-c9d0-4b3a-89a3-18a14e5c084b")
        public static TagType PROVIDERNAMES_TAGTYPE_ELT;

        @objid ("f3ea098f-7e4c-420c-89b5-094f61bd33c0")
        public static TagType CLOUDTYPE_TAGTYPE_ELT;

        @objid ("f4ebd7e2-f150-4a8b-84c0-874fe270f4ed")
        private static Stereotype MDAASSOCDEP;

        @objid ("77cc2826-d4d3-49b6-888d-204effd1af90")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("23c30b6a-1cf8-4525-80eb-a94a55897959")
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
