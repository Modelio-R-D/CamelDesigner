/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
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
public class ConstraintModel extends SubModel {
    @objid ("a8f6ebb3-71ea-4f13-89e3-c9e811d902e8")
    public static final String STEREOTYPE_NAME = "ConstraintModel";

    /**
     * Tells whether a {@link ConstraintModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ConstraintModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fc62e809-bfa1-4c9b-8d88-d96b6d1ef113")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << ConstraintModel >> then instantiate a {@link ConstraintModel} proxy.
     * 
     * @return a {@link ConstraintModel} proxy on the created {@link Package}.
     */
    @objid ("e7494741-5127-4f5d-8823-62709e150b71")
    public static ConstraintModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME);
        return ConstraintModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link ConstraintModel} proxy from a {@link Package} stereotyped << ConstraintModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link ConstraintModel} proxy or <i>null</i>.
     */
    @objid ("ac253c55-aa08-4d1a-ae65-14583dc90727")
    public static ConstraintModel instantiate(final Package obj) {
        return ConstraintModel.canInstantiate(obj) ? new ConstraintModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ConstraintModel} proxy from a {@link Package} stereotyped << ConstraintModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link ConstraintModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5dd4e095-ff45-4188-a82a-7649fae031e7")
    public static ConstraintModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (ConstraintModel.canInstantiate(obj))
        	return new ConstraintModel(obj);
        else
        	throw new IllegalArgumentException("ConstraintModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("914663b6-8d79-4f8d-8576-52cd311c430d")
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
    @objid ("245049c9-3d87-451f-903a-664376019f9f")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    @objid ("9e41030d-f258-4f6e-91cd-22e515de3326")
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

    @objid ("f5f04664-af4c-44cc-b0b6-bde8e6a81de1")
    protected ConstraintModel(final Package elt) {
        super(elt);
    }

    @objid ("ebe267b3-9ebc-4287-8f57-7be02738f119")
    public static final class MdaTypes {
        @objid ("af563da5-a201-4348-a37d-0a00cbc1cf7c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("82a9902d-e9a0-45ed-ac25-9f1f4dee2ff5")
        private static Stereotype MDAASSOCDEP;

        @objid ("89dcb5bd-fa5a-4f6b-aad4-51ad570748bb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f6e03559-a3d4-4459-b0ce-7701b29c7337")
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
