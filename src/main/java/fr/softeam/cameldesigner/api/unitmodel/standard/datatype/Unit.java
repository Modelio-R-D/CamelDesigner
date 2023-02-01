/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << Unit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ad5e8f7b-b3a0-4678-bcf5-5ad638242927")
public abstract class Unit extends FeatureDataType {
<<<<<<< HEAD
    @objid ("8605dbe4-5221-4b6d-98dd-598068e4659d")
=======
    @objid ("e2892286-bde2-4191-af08-c6d92ecefae2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Unit";

    /**
     * Tells whether a {@link Unit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Unit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("bca53e93-19ca-4fcf-895e-a5744d3c823a")
=======
    @objid ("25229a49-9cf7-476d-a4fd-503eab4d4844")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Unit.STEREOTYPE_NAME));
    }

    @objid ("b4187319-dc53-4313-a5b9-108169109c29")
    public static Unit instantiate(final DataType obj) {
        return DimensionedUnit.canInstantiate(obj) ?  DimensionedUnit.instantiate(obj) : Dimensionless.canInstantiate(obj) ? new Dimensionless(obj) : null;
    }

    /**
     * Add a value of the 'multipleOf' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("2e9a7713-825a-485a-99bf-0ad60d4bc3ed")
=======
    @objid ("4ec5086e-6e42-4bc8-be19-5de78f910d81")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addMultipleOf(final Unit obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, Unit.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

<<<<<<< HEAD
    @objid ("fe41d7ae-c7a9-4a41-8e74-8e1d57f32661")
=======
    @objid ("35303a2e-55a3-4d48-ba41-e2e75bb5aa77")
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
        Unit other = (Unit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("c27cc4ae-c2a3-4968-aa3a-208a64f6cd23")
=======
    @objid ("15dc0e3b-a76f-419e-9a44-e8e6c2f56bfc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Get the values of the 'multipleOf' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("3b83da54-4042-4d70-bcc4-834d70aec91f")
=======
    @objid ("687275f0-74bd-4ccc-ae13-178acaf31ae9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<Unit> getMultipleOf() {
        List<Unit> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(Unit.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE), "")
              && Unit.canInstantiate(d.getImpacted())) {
                 results.add((Unit)CamelDesignerProxyFactory.instantiate(d.getImpacted(), Unit.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("dcc63b52-bb40-43b3-88e0-c89b8be34cfc")
=======
    @objid ("c88ea3b6-11e2-4378-8200-45e9de4e91f5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'multipleOf' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("0116d32d-7eb5-4080-acad-d9a29f2a6bff")
=======
    @objid ("bc780313-d3ae-4158-8fdb-9515c24e4c47")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeMultipleOf(final Unit obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(Unit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("acb2e845-73b3-40db-9281-6b0c618e3a8c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("6413091b-f7bf-4bbc-865f-ac5a338e9b4c")
=======
    @objid ("8e73aaa2-f4ed-4862-91db-5f1b66b91062")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Unit(final DataType elt) {
        super(elt);
    }

    @objid ("6a12e779-f186-4ba1-ab98-47ecdcdb6ad2")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("fea587a1-1d04-4ae2-80d2-a92a97fab48b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e610d61a-0fd2-436f-b530-73123b0e3317")
        private static Stereotype MDAASSOCDEP;

        @objid ("07b37020-a422-4782-9652-9f0f28b6fb4f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fccc076b-bc7e-42a2-8ce0-7241df1c5e7e")
=======
        @objid ("724b1e2e-f47e-4424-acaa-f7b5daf9e620")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e06e19bb-c03e-4fb1-ad9b-7c2bcc237391")
        private static Stereotype MDAASSOCDEP;

        @objid ("27859b88-28cb-49d3-9e28-4c5ce9007d50")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2404af07-42b2-483d-b7dc-c4e39e8cafee")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "56c9f56b-274d-4816-80c8-72536d1d7295");
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
