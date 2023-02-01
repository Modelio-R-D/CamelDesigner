/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("226f9906-d0af-4bf6-baea-ab05b307b7ef")
=======
    @objid ("0046a800-2adc-489f-80f6-e878d852fb61")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "ConstraintModel";

    /**
     * Tells whether a {@link ConstraintModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << ConstraintModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("08147451-0c67-4195-b6d6-a54cae7cb350")
=======
    @objid ("adbf955b-0f5e-4423-b5a9-db2f9c22da65")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ConstraintModel.STEREOTYPE_NAME));
    }

<<<<<<< HEAD
    @objid ("3a57b45e-c038-4c85-a8e2-20b14e8aa330")
=======
    @objid ("68b595cb-dc89-43c6-a053-d48916631b27")
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
        ConstraintModel other = (ConstraintModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("6494b73a-467f-42e5-8cea-c9e5eb420fc9")
=======
    @objid ("fbbb3f4a-7f0a-4119-b7e9-ba86161903cf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

<<<<<<< HEAD
    @objid ("82345a57-5ff1-4c79-a837-e41bb5365ca0")
=======
    @objid ("4eafde2d-5ad2-48c8-9634-be12f04bb8fd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("24c484f2-164d-4bb5-91b0-c4e6e799d32c")
=======
    @objid ("80bb148b-be41-4572-a419-3b61d3b02cf1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ConstraintModel(final Package elt) {
        super(elt);
    }

    @objid ("ebe267b3-9ebc-4287-8f57-7be02738f119")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("14eb0a56-2614-4710-8a6a-0ab177c2eb09")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fade4b99-a849-46c8-9b8c-21a918fe8642")
        private static Stereotype MDAASSOCDEP;

        @objid ("8d79722a-0add-40e5-a3d8-4acfca068836")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2cda8c98-2923-4d0a-903f-a81e22fa6bdb")
=======
        @objid ("fc78c09c-ef86-46de-9f3f-fe4f497659c5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d25e9f11-69ad-441a-bb08-a1b75acbca28")
        private static Stereotype MDAASSOCDEP;

        @objid ("52ad5c31-2ab3-4854-8933-ca3cccfe9115")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("557721af-d34c-40f2-a7f6-72ac38960eb5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
