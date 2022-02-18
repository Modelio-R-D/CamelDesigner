/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.locationmodel.standard.enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.enumeration.FeatureEnumeration;
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
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Enumeration} with << Location >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a6a4b7ae-60d0-494b-a18d-6990283999a7")
public abstract class Location extends FeatureEnumeration {
    @objid ("b061e7f2-fe47-4198-a72f-26322aaa0de4")
    public static final String STEREOTYPE_NAME = "Location";

    @objid ("f1607a04-9314-4e92-bb87-fdc6ed218ac4")
    public static final String ID_TAGTYPE = "id";

    /**
     * Tells whether a {@link Location proxy} can be instantiated from a {@link MObject} checking it is a {@link Enumeration} stereotyped << Location >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("80b8e3a9-2b9c-4820-8504-c1dff8d81ccf")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Enumeration) && ((Enumeration) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Location.STEREOTYPE_NAME));
    }

    /**
     * Tries to instantiate a {@link Location} proxy from a {@link Enumeration} stereotyped << Location >> or << GeographicalRegion >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param enumeration a Enumeration
     * @return a {@link Location} proxy or <i>null</i>.
     */
    @objid ("7b872eee-d559-4eb7-992c-24240af62e5b")
    public static Location instantiate(final Enumeration enumeration) {
        if (CloudLocation.canInstantiate(enumeration))
            return new CloudLocation(enumeration);
        
        if (GeographicalRegion.canInstantiate(enumeration))
            return new GeographicalRegion(enumeration);
        return null;
    }

    /**
     * Tries to instantiate a {@link Location} proxy from a {@link Enumeration} stereotyped << Location >> or << GeographicalRegion >>checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Enumeration}
     * @return a {@link Location} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("84e8a941-195d-443d-8c17-8086b310c3d1")
    public static Location safeInstantiate(final Enumeration obj) throws IllegalArgumentException {
        if (CloudLocation.canInstantiate(obj))
            return new CloudLocation(obj);
        
        if (GeographicalRegion.canInstantiate(obj))
            return new GeographicalRegion(obj);
        
        throw new IllegalArgumentException("Location: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4ce7957e-28ae-4bd3-a7a7-7b4e655402ba")
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
        Location other = (Location) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Enumeration}. 
     * @return the Enumeration represented by this proxy, never null.
     */
    @objid ("4f2650e3-d487-4700-b2a9-1c7cb581c53f")
    @Override
    public Enumeration getElement() {
        return (Enumeration)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c9be85d4-c413-428b-9a4d-f89321925bd4")
    public String getId() {
        return this.elt.getTagValue(Location.MdaTypes.ID_TAGTYPE_ELT);
    }

    @objid ("9846b3db-2167-4ee6-a998-9e296b933db3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8d39d880-7e91-4edf-97a9-3a2dee2b0fa9")
    public void setId(final String value) {
        this.elt.putTagValue(Location.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    @objid ("2f685fd0-8f92-4030-b219-78d528bf236a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("993e736d-cd10-4dd6-899d-9b7d8a3d47d2")
    protected Location(final Enumeration elt) {
        super(elt);
    }

    @objid ("a0bb5fe1-09b7-41e5-9811-6126f9ea7b6e")
    public static final class MdaTypes {
        @objid ("226a5a74-374a-4da8-9959-d2f0cd8877ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0ec1fba9-3a9a-4542-91e7-5ca48d1e1380")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("47534065-cd3c-4b90-8101-ee492a6c9f73")
        private static Stereotype MDAASSOCDEP;

        @objid ("eabc1a7d-9de6-41f1-bea0-4dd3fe273cf8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("48c29ee9-9699-4314-b09d-81791b694e37")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "451ac0cf-b5d0-488a-8f05-43139794aa83");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4726ff4f-02ae-437f-aebc-16cda8f5d0df");
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
