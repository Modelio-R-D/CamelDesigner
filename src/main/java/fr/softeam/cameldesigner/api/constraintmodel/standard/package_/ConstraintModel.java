/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << ConstraintModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("86cc342f-3138-45c5-9f57-831a1ef207ca")
public abstract class ConstraintModel extends SubModel {
    @objid ("767003e7-cdc4-4ab2-a742-f7623a9c86d9")
    public static final String STEREOTYPE_NAME = "ConstraintModel";

    /**
     * Tells whether a {@link ConstraintModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ConstraintModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("17e038ba-8ffe-4e30-931c-320ce08cf177")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME));
    }

    @objid ("e0729f1b-7d47-4fa0-a227-4f77998b3c5f")
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
        ConstraintModel other = (ConstraintModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("b7e339ca-4c53-4338-ba36-2ba81e87ea69")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("7e1c328b-e5d1-4098-9a8e-b98450a7f14e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9025f90d-62ce-4bbe-bd7b-0fd4343e9ec5")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("0d4d1f6a-e16f-4b21-b1d2-fdb7ecb11533")
    protected ConstraintModel(final Package elt) {
        super(elt);
    }

    @objid ("ebe267b3-9ebc-4287-8f57-7be02738f119")
    public static final class MdaTypes {
        @objid ("45eee557-c0b3-4386-9a19-2946a942c48f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b32bf535-46ac-4b5c-ae97-80ee1926f139")
        private static Stereotype MDAASSOCDEP;

        @objid ("faeed024-89e9-4f35-86c3-e43c52e2cf53")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8bf73741-cd26-4b42-857e-68ca8b524fca")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0a13db20-02d0-45a2-954a-db10f14d206b");
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
