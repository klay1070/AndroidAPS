package info.nightscout.androidaps.plugins.general.overview.events

import info.nightscout.androidaps.data.PumpEnactResult
import info.nightscout.androidaps.data.PumpEnactResultImpl
import info.nightscout.rx.events.Event

class EventDismissBolusProgressIfRunning(val result: PumpEnactResult?, val id: Long?) : Event()