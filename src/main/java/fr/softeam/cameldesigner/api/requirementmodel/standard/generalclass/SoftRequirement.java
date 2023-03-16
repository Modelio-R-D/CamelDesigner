/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass;

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
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link GeneralClass} with << SoftRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("539e2a12-8c48-42f5-9783-5248ca11085c")
public abstract class SoftRequirement extends Requirement {
    @objid ("0173ca0c-8204-4521-b9ec-4c839cba3985")
    public static final String STEREOTYPE_NAME = "SoftRequirement";

    @objid ("e6025432-0543-4e39-ab67-d2af14d0b13c")
    public static final String PRIORITY_TAGTYPE = "priority";

    /**
     * Tells whether a {@link SoftRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link GeneralClass} stereotyped << SoftRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("73794c57-b938-4ed1-9d11-6e87d2876070")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof GeneralClass) && ((GeneralClass) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SoftRequirement.STEREOTYPE_NAME));
    }

    @objid ("cf9fd09f-0df6-43cf-ae2a-99f79dea93ab")
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
        SoftRequirement other = (SoftRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link GeneralClass}. 
     * @return the GeneralClass represented by this proxy, never null.
     */
    @objid ("b77664f6-4d96-4076-8cf8-d6f54c062d93")
    @Override
    public GeneralClass getElement() {
        return (GeneralClass)super.getElement();
    }

    /**
     * Getter for string property 'priority'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c33fc312-50db-4b33-b92a-f02159473b9f")
    public String getPriority() {
        return this.elt.getTagValue(SoftRequirement.MdaTypes.PRIORITY_TAGTYPE_ELT);
    }

    @objid ("fe89a57d-7de3-4880-8d5d-3c1af22c2780")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'priority'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8298a02b-1c53-43ce-b83d-24456d4a35dd")
    public void setPriority(final String value) {
        this.elt.putTagValue(SoftRequirement.MdaTypes.PRIORITY_TAGTYPE_ELT, value);
    }

    @objid ("4e195c55-e872-4135-ba88-5cfc0cf2db22")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("42d6c460-b051-4ded-8913-22593238d9d3")
    protected SoftRequirement(final GeneralClass elt) {
        super(elt);
    }

    @objid ("e11f1b31-a2cb-4b0a-a55c-c134d2473491")
    public static final class MdaTypes {
        @objid ("66fefa8c-ea5e-4f30-a34b-928c7073c6c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a52cc2d1-2774-4f03-b3ac-4ab1cee5e225")
        public static TagType PRIORITY_TAGTYPE_ELT;

        @objid ("37ef2c97-d433-474a-9260-c363ebc37ef6")
        private static Stereotype MDAASSOCDEP;

        @objid ("bc903314-2414-4a60-b244-72312b82b7b0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("67f5e4aa-821c-49d9-b9f8-326f5913ecb2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fc1abdeb-e2fa-4a04-9253-4e15a223bce2");
            PRIORITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1f38e006-1584-4036-8ddc-f39a5b607306");
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
