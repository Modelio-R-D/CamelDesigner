/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("e804ca68-e837-44fd-9526-048c787186b6")
    public static final String STEREOTYPE_NAME = "ProviderRequirement";

    @objid ("e93bc783-4e67-4b55-9f60-8524f575b61d")
    public static final String CLOUDTYPE_TAGTYPE = "cloudType";

    @objid ("d01ad0dd-0e75-410c-9d34-faf45122ebdf")
    public static final String PROVIDERNAMES_TAGTYPE = "providerNames";

    /**
     * Tells whether a {@link ProviderRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ProviderRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("321fa5d9-718c-4746-ba1a-6002fb120e14")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ProviderRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ProviderRequirement >> then instantiate a {@link ProviderRequirement} proxy.
     * 
     * @return a {@link ProviderRequirement} proxy on the created {@link Class}.
     */
    @objid ("3df1c29d-4684-420f-ac4b-6dcd69ab1ced")
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
    @objid ("ba547cec-9449-438e-b0e9-3313e2ac82bb")
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
    @objid ("c9f7b0c0-d2d7-4b59-9d58-91401e065440")
    public static ProviderRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ProviderRequirement.canInstantiate(obj))
        	return new ProviderRequirement(obj);
        else
        	throw new IllegalArgumentException("ProviderRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("333bdb2c-3fe9-46e3-9c3d-f44f0c090086")
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
    @objid ("e44c766e-dc43-42b5-ab87-b85893cb2bf4")
    public String getCloudType() {
        return this.elt.getTagValue(ProviderRequirement.MdaTypes.CLOUDTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8cf98ddd-3852-414f-95f8-3687d47c6757")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for List<String> property 'providerNames'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    @objid ("00d85d92-c667-414c-832c-8094788696a9")
    public List<String> getProviderNames() {
        return this.elt.getTagValues(ProviderRequirement.MdaTypes.PROVIDERNAMES_TAGTYPE_ELT);
    }

    @objid ("86cb9fd4-7106-494a-89b5-f4212c63fcab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'cloudType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("450593ce-c8f5-457a-84d5-8bbc9b6c4f40")
    public void setCloudType(final String value) {
        this.elt.putTagValue(ProviderRequirement.MdaTypes.CLOUDTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'providerNames'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("90c5caa1-261e-42e6-ba70-cf746fef21d1")
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

    @objid ("8042439e-2bcb-4542-af0b-8d755c6aa74d")
    protected ProviderRequirement(final Class elt) {
        super(elt);
    }

    @objid ("562f3532-fd37-4432-a9ac-219453fb6332")
    public static final class MdaTypes {
        @objid ("95045b6d-8de5-4c2e-8e99-991b5754971d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fb8b9b8a-885f-4d57-a0e3-a1c7460c44aa")
        public static TagType PROVIDERNAMES_TAGTYPE_ELT;

        @objid ("e5330c88-fd32-4029-9bae-6348f4c436ad")
        public static TagType CLOUDTYPE_TAGTYPE_ELT;

        @objid ("b2c4544a-a386-4ca8-9e22-03aa77166866")
        private static Stereotype MDAASSOCDEP;

        @objid ("ba3c9eca-8adc-430a-aff0-2c46c4137d6b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("96aec94a-4704-4511-9eab-a4b575574d74")
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
